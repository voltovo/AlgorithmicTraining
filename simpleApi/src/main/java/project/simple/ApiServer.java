package project.simple;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ApiServer {

    private static final String DEFAULT_SERVER_IP = "0.0.0.0";
    private static final int DEFAULT_PORT = 4040;

    public static void main(String[] args) {
        Server server = null;
        // server start log
        System.out.println("[" + getTime() + "] [SIMPLE HTTP SERVER] [START]");
        // server end log
        Runnable shutdown = () -> {
            System.out.println("[" + getTime() + "] [SIMPLE HTTP SERVER] [STOP]");
        };
        try {
            // server create
            server = new Server(DEFAULT_SERVER_IP, DEFAULT_PORT);
            server.start();

            Runtime.getRuntime().addShutdownHook(new Thread(shutdown));

            // 종료 방법 안내
            System.out.println("Please press 'Enter' to stop the simpleServer");
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // server stop
            // 0 : 즉시 종료
            server.stop(0);
        }
    }

    /**
     * 현재 날짜 시간
     * @return
     */
    private static String getTime() {
        // 현재 날짜와 시간 가져오기
        LocalDateTime currentTime = LocalDateTime.now();
        // 형식 지정을 위한 DateTimeFormatter 사용
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 현재 날짜와 시간 출력
        return currentTime.format(formatter);
    }
}
