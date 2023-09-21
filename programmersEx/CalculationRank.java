package programmersEx;

public class CalculationRank {
    public static int[] solution(int[][] score) {
        double[] averageArray = new double[score.length];
        int[] rankArray = new int[averageArray.length];

        // 평균 구하기
        for (int i = 0; i < score.length; i++) {
            double average = (double) (score[i][0] + score[i][1]) / 2;
            averageArray[i] = average;
        }

        for (int i = 0; i < averageArray.length; i++) {
            // 등수 카운팅
            int rank = 1;
            for (int j = 0; j < averageArray.length; j++) {
                if (averageArray[j] > averageArray[i]) {
                    rank++;
                }
            }
            rankArray[i] = rank;
        }

        return rankArray;
    }
}
