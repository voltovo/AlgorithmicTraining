package doitEx;

/**
 * PrimeNumber1
 */
// 1000 이하의 소수 열거
public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 2; i <= 100; i++) {
            int j;
            for (j = 2; j < i; j++) {
                counter++;
                if(i % j == 0) break;   //나누어 떨어지면 소수가 아님
            }
            if(i == j){ //마지막까지 나누어 떨어지지 않으면 소수
                System.out.println(i);
            }
        }

        System.out.println("나눗셈을 수행한 횟수 = " + counter);
    }
}