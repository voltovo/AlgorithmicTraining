package programmersEx;

import java.util.Arrays;

public class MaxValue2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -5};

        System.out.println("곱하기 최대 값 구하기 : " + solution(numbers));

    }

    private static int solution(int[] numbers) {
        int answer = 0;

        // 배열을 오른차순으로 정렬 (작은 수 --> 큰 수)
        Arrays.sort(numbers);

        int length = numbers.length;
        // 큰 수가 나오는 경우 두 가지
        // 음수 * 음수 / 양수 * 양수
        // 음수가 있는 앞에서 부터 곱하고,  양수 중에 큰 수가 있는 뒤에서 부터 곱해서
        // 두 값을 비교 후 결과 값 정하기
        answer = numbers[length - 1] * numbers[length - 2] < numbers[0] * numbers[1] ? numbers[0]
            * numbers[1] : numbers[length - 1] * numbers[length - 2];

        return answer;
    }
}
