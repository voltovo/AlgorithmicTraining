package programmersEx;

public class FiniteDecimalCalculation {

    public static int solution(int a, int b) {
        int gcd = gcd(a, b);

        // b를 최대 공약수로 나누기
        b /= gcd;

        // b가 2 또는 5로만 나누어질 경우 1을 반환, 그렇지 않으면 2를 반환
        while (b > 1) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }

    // 최대 공약수 계산을 위한 함수
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
