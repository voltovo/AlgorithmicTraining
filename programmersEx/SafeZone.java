package programmersEx;

public class SafeZone {

    public static int solution(int[][] board) {
        int answer = 0;
        int Y_LENGTH = board.length;
        int X_LENGTH = board[0].length;

        for (int i = 0; i < Y_LENGTH; i++) {
            for (int j = 0; j < X_LENGTH; j++) {
                if (board[i][j] == 0) {
                    // 안전 여부
                    boolean isSafe = true;
                    // 주변 8방향을 확인
                    for (int dx = -1; dx <= 1; dx++) {
                        for (int dy = -1; dy <= 1; dy++) {
                            int newX = i + dx;
                            int newY = j + dy;

                            if (newX >= 0 && newX < Y_LENGTH && newY >= 0 && newY < X_LENGTH) {
                                if (board[newX][newY] == 1) {
                                    isSafe = false;
                                    break;
                                }
                            }
                        }
                        if (!isSafe) {
                            break;
                        }
                    }
                    // 모두 0 이면 카운팅
                    if (isSafe) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
