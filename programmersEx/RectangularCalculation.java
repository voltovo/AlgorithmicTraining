package programmersEx;

public class RectangularCalculation {
    public static int solution(int[][]dots){
        // 최소 값을 구하기 위해서 Integer.MAX_VALUE를 사용
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        // 최대 값을 구하기 위해서 Integer.MIN_VALUE를 사용
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        // 최대x, 최소x, 최대y, 최소y를 구함
        for (int[] dot : dots) {
            int x = dot[0];
            int y = dot[1];
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        // x-y 로 사각형의 넓이를 구함
        int width = maxX - minX;
        int height = maxY - minY;
        int maxArea = width * height;

        return maxArea;
    }
}
