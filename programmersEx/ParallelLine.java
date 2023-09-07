package programmersEx;

public class ParallelLine {

    public static int solution(int[][] dots) {
        double slopeA = (double) (dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0]);
        double slopeB = (double) (dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]);
        if (slopeA == slopeB) {
            return 1;
        }
        slopeA = (double) (dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0]);
        slopeB = (double) (dots[3][1] - dots[1][1]) / (dots[3][0] - dots[1][0]);
        if (slopeA == slopeB) {
            return 1;
        }
        slopeA = (double) (dots[3][1] - dots[0][1]) / (dots[3][0] - dots[0][0]);
        slopeB = (double) (dots[2][1] - dots[1][1]) / (dots[2][0] - dots[1][0]);
        if (slopeA == slopeB) {
            return 1;
        }
        return 0;
    }
}
