package programmersEx;

import java.util.Arrays;

public class AdditionOfDenominator {

    public static void main(String[] args) {

//        System.out.println("분수의 덧셈 = "+ Arrays.toString(solution(1,2,3,4)));
        System.out.println("분수의 덧셈 = "+ Arrays.toString(solution(9,2,1,3)));
//        System.out.println("분수의 덧셈 = " + Arrays.toString(solution(1, 1, 1, 1)));

    }

    private static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        // 최대 공약수
        int max = 0;

        for (int i = 1; i <= denom1 && i <= denom2; i++) {
            if (denom1 % i == 0 && denom2 % i == 0) {
                max = i;
            }
        }
        // 분모의 최소 공배수
        int min = (denom1 * denom2) / max;
        // 첫번째 분자에 곱해야 하는 수
        int multiNum1 = min / denom1;
        // 두번째 분자에 곱해야 하는 수
        int multiNum2 = min / denom2;

        answer = new int[2];

        int firstNumerator = numer1 * multiNum1 + numer2 * multiNum2;
        int firstDenominator = min;

        // 구한 분수를 기약분수로 변환
        int gcd = 0;
        for (int i = 1; i <= firstDenominator; i++) {
            if (firstNumerator % i == 0 && firstDenominator % i == 0) {
                gcd = i;
            }
        }
        answer[0] = firstNumerator / gcd;
        answer[1] = firstDenominator / gcd;
        return answer;
    }
}
