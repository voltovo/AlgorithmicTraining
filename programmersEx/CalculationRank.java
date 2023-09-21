package programmersEx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CalculationRank {
    public static int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for (int[] t : score) {
            // 평균의 순서나 점수를 모두 더하나 순위를 정의하는데 별반 다른게 없음
            scoreList.add(t[0] + t[1]);
        }
        // 높은 점수 순서대로 정렬
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            // 인덱스 번호 + 1 로 등수를 추출
            // indexOf를 하는 경우 같은 점수가 있어도 적은 인덱스가 추출되고 +1을 하기 때문에 ...
            // 1등이 두번 나오고 3등이 나오는 형식 가능 {1,1,3}
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
        }
        return answer;
    }
}
