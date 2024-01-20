package project.simple;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class httpServer {
    // 네트워크 소켓에서 연결을 받아들일 수 있는 대기 큐의 크기
    // 기본 값 = 리눅스 128, 윈도우 5
    private final int DEFAULT_BACKLOG = 0;
    private HttpServer server = null;

    public httpServer(String ip, int port) throws IOException {
        createServer(ip, port);
    }

    /**
     * 서버 생성
     * @param ip
     * @param port
     * @throws IOException
     */
    private void createServer(String ip, int port) throws IOException {
        // Http Server 생성
        this.server = HttpServer.create(new InetSocketAddress(ip, port), DEFAULT_BACKLOG);

        // Http Server Context 설정
        server.createContext("/");
        server.createContext("/totalCount");
        server.createContext("/");
    }

    /**
     * 서버 실행
     */
    public void start(){
        server.start();
    }

    /**
     * 서버 중지
     * @param delay
     */
    public void stop(int delay) {
        server.stop(delay);
    }
}
