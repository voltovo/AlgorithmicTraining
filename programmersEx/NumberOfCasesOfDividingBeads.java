package programmersEx;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberOfCasesOfDividingBeads {
    public static int solution(int balls, int share) {
        // double은 연산하기에 부적합하므로 BigDecimal을 사용한다.
        BigDecimal decimalDenominator = new BigDecimal(factorial(balls));
        BigDecimal decimalNumerator = new BigDecimal(factorial(balls - share) * factorial(share));
        // 소수점 2자리에서 반올림
        BigDecimal decimalAnswer = decimalDenominator.divide(decimalNumerator, 2, RoundingMode.HALF_UP);
        return decimalAnswer.intValue();
    }
    // 프로그래머스 문제에서 알려준 공식
    // 서로 다른 n개 중 m개를 뽑는 경우의 수 공식은 다음과 같습니다.
    // n! / (n-m)! * m!
    // 공식에 적용하기 위한 팩토리얼 메소드
    public static double factorial(int num){
        double result = 1;
        if(num == 0){
            return result;
        }
        for(int i = 1; i <= num; i++){
            result *= i;
        }

        return result;
    }
}
