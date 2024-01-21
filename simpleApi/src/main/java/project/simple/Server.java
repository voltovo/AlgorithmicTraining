package project.simple;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Server {

    // 네트워크 소켓에서 연결을 받아들일 수 있는 대기 큐의 크기
    // 기본 값 = 리눅스 128, 윈도우 5
    private static final int DEFAULT_BACKLOG = 0;
    private static final int SUCCESS_STATUS_CODE = 200;
    private static final int ERROR_STATUS_CODE = 500;
    private static final String SAMPLE_DATA_PATH = "src/main/resources/data/sampleData.json";
    private HttpServer server = null;

    public Server(String ip, int port) throws IOException {
        createServer(ip, port);
    }

    /**
     * 서버 생성
     *
     * @param ip
     * @param port
     * @throws IOException
     */
    private void createServer(String ip, int port) throws IOException {
        // Http Server 생성
        this.server = HttpServer.create(new InetSocketAddress(ip, port), DEFAULT_BACKLOG);

        // Http Server Context 설정
        server.createContext("/", new RootHandler());
        server.createContext("/totalCount", new CountingHandler());
        server.createContext("/search", new SearchHandler());
    }

    /**
     * 서버 실행
     */
    public void start() {
        server.start();
    }

    /**
     * 서버 중지
     *
     * @param delay
     */
    public void stop(int delay) {
        server.stop(delay);
    }

    /**
     * 루트 핸들러
     */
    class RootHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            try (OutputStream responseBody = exchange.getResponseBody()){
                // 응답 메시지 작성
                JSONObject responseJson = new JSONObject();
                responseJson.put("Method", exchange.getRequestMethod());
                responseJson.put("URI", exchange.getRequestURI());
                responseJson.put("Message", "Server is operational");

                // 응답 메시지 전달
                responseBody.write(makeSuccessResponseHeader(exchange, responseJson));
            } catch (IOException e) {
                e.printStackTrace();
                // 서버 오류 에서 메시지 전달
                makeErrorResponseHeader(exchange);
            } finally {
                exchange.close();
            }
        }
    }

    /**
     * 데이터 수량 파악 핸들러
     */
    private class CountingHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            try (FileReader reader = new FileReader(SAMPLE_DATA_PATH);
                OutputStream responseBody = exchange.getResponseBody()) {
                // 응답 메시지 작성
                JSONParser parser = new JSONParser();
                JSONArray sampleDataJson = (JSONArray) parser.parse(reader);
                JSONObject responseJson = new JSONObject();
                responseJson.put("Method", exchange.getRequestMethod());
                responseJson.put("URI", exchange.getRequestURI());
                responseJson.put("Total count", sampleDataJson.size());

                // 응답 메시지 전달
                responseBody.write(makeSuccessResponseHeader(exchange, responseJson));
            } catch (IOException | ParseException e) {
                e.printStackTrace();
                // 서버 오류 에서 메시지 전달
                makeErrorResponseHeader(exchange);
            } finally {
                exchange.close();
            }
        }
    }

    /**
     * 유저 정보 조회 핸들러
     */
    private class SearchHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            try (OutputStream responseBody = exchange.getResponseBody()){
                String userId = getUserId(exchange);
                JSONObject userInfoJson = getUserInfo(userId);

                // 응답 메시지 작성
                JSONObject responseJson = new JSONObject();
                responseJson.put("Method", exchange.getRequestMethod());
                responseJson.put("URI", exchange.getRequestURI());
                if (userInfoJson.isEmpty()) {
                    responseJson.put("UserInfo", "No data");
                } else {
                    responseJson.put("UserInfo", userInfoJson);
                }

                // 응답 메시지 전달
                responseBody.write(makeSuccessResponseHeader(exchange, responseJson));
            } catch (IOException e) {
                e.printStackTrace();
                // 서버 오류 에서 메시지 전달
                makeErrorResponseHeader(exchange);
            } finally {
                exchange.close();
            }
        }
    }

    /**
     * 유저 정보 조회
     *
     * @param userId
     * @return
     */
    private JSONObject getUserInfo(String userId) {
        JSONObject userInfoJson = new JSONObject();
        Path filePath = Paths.get(SAMPLE_DATA_PATH);
        try (BufferedReader reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
            JSONParser parser = new JSONParser();
            JSONArray sampleDataJson = (JSONArray) parser.parse(reader);

            // 데이터 검색
            return (JSONObject) sampleDataJson.stream()
                .filter(data -> data instanceof JSONObject)
                .map(data -> (JSONObject)data)
                .filter(dataJson -> userId.equals(String.valueOf(((JSONObject) dataJson).get("user_id"))))
                .findFirst()
                .orElse(userInfoJson);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return userInfoJson;
    }

    private String getUserId(HttpExchange exchange) {
        String query = exchange.getRequestURI().getQuery();
        String[] param = query.split("=");
        return param[1];
    }

    /**
     * 서버 에러 발생 시 응답 헤더
     *
     * @param exchange
     * @return
     */
    private byte[] makeErrorResponseHeader(HttpExchange exchange) {
        // error 메시지 작성
        JSONObject errorJson = new JSONObject();
        errorJson.put("Message", "Server Error");

        // 응답 메시지를 바이트 단위로 가공
        byte[] content = errorJson.toJSONString().getBytes(Charset.forName("UTF-8"));
        int contentLength = content.length;

        try {
            // 클라이언트에 보낼 response 헤더 설정
            Headers headers = exchange.getResponseHeaders();
            headers.add("Content-Type", "application/json");
            headers.add("Content-Length", String.valueOf(contentLength));
            exchange.sendResponseHeaders(ERROR_STATUS_CODE, contentLength);
            exchange.getResponseBody().write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            exchange.close();
        }
        return content;
    }

    /**
     * 정상적인 응답 헤더
     *
     * @param exchange
     * @param responseJson
     * @return
     * @throws IOException
     */
    private byte[] makeSuccessResponseHeader(HttpExchange exchange, JSONObject responseJson) throws IOException {
        // 응답 메시지를 바이트 단위로 가공
        byte[] content = responseJson.toJSONString().getBytes(Charset.forName("UTF-8"));
        int contentLength = content.length;

        // 클라이언트에 보낼 response 헤더 설정
        Headers headers = exchange.getResponseHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Content-Length", String.valueOf(contentLength));
        exchange.sendResponseHeaders(SUCCESS_STATUS_CODE, contentLength);

        return content;
    }
}
