package programmersEx;

import java.util.ArrayList;
import java.util.Comparator;

public class MaxValue2 {
    public static void main(String[] args) {
        int[] numbers = {1,-1};

        System.out.println("곱하기 최대 값 구하기 : " + solution(numbers));

    }

    private static int solution(int[] numbers) {
        int answer = 0;
        // 곱한 값을 보관할 list 생성
        ArrayList<Integer> multiList = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                // 곱한 값을 list에 보관
                multiList.add(numbers[i] * numbers[j]);
            }
        }
        // list를 내림차순으로 정렬 (높은 수가 제일 앞에 옴)
        multiList.sort(Comparator.reverseOrder());
        // 첫번쨰 숫자가 제일 큼료
        answer = multiList.get(0);
        return answer;
    }
}
