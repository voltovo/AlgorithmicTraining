package programmersEx;

public class MinimumRectangle {

    public static int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            maxWidth = Math.max(maxWidth, size[0]);
            maxHeight = Math.max(maxHeight, size[1]);
        }

        boolean largerWidth = maxWidth > maxHeight;
        int maxSize = 0;
        for (int[] size : sizes) {
            int minLength = Math.min(size[0], size[1]);
            maxSize = Math.max(minLength, maxSize);
        }

        return largerWidth ? maxWidth * maxSize : maxHeight * maxSize;
    }
}
