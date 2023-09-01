package programmersEx;

public class CharacterCoordinateCalculation {
    public static int[] solution(String[] keyinput, int[] board){
        int[] answer = {0,0};
        int MAX_HEIGHT = board[1] / 2;
        int MAX_WIDTH = board[0] / 2;
        int height = 0;
        int width = 0;

        for(String key : keyinput){
            switch(key){
                case "up":
                    height = Math.min(MAX_HEIGHT, ++height);
                    break;
                case "down":
                    height = Math.max(-MAX_HEIGHT, --height);
                    break;
                case "left":
                    width = Math.max(-MAX_WIDTH, --width);
                    break;
                case "right":
                    width = Math.min(MAX_WIDTH, ++width);
                    break;
            }
        }

        // 가로 값
        answer[0] = width;
        // 새로 값
        answer[1] = height;
        return answer;
    }
}
