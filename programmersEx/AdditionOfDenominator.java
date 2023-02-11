package programmersEx;

import java.util.Arrays;

public class AdditionOfDenominator {

    public static void main(String[] args) {

//        System.out.println("분수의 덧셈 = "+ Arrays.toString(solution(1,2,3,4)));
        System.out.println("분수의 덧셈 = "+ Arrays.toString(solution(9,2,1,3)));
//        System.out.println("분수의 덧셈 = " + Arrays.toString(solution(1, 1, 1, 1)));

    }

    private static int[] solution(int numer1, int denom1, int numer2, int denom2) {

        // 공통 분수 값 구하기
        int denominator = denom1 * denom2;
        int numerator1 = numer1 * denom2;
        int numerator2 = numer2 * denom1;
        int totalNumerator = numerator1 + numerator2;

        // 분자와 분모의 최대공약수를 찾아서 기약 분수로 만들기
        for(int i = denominator; i <= 1; i--){
            if(totalNumerator % i ==0 && denominator % i == 0){
                denominator /= i;
                totalNumerator /= i;
            }
        }

        int[] answer = {totalNumerator, denominator};

        return answer;
    }
}
