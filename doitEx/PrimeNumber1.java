package doitEx;

/**
 * PrimeNumber1
 */
// 1000 이하의 소수 열거
public class PrimeNumber1 {
    public static void main(String[] args) {
        // 세번째 개선 방안
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for (int i = 5; i <= 1000; i += 2) {
            boolean flag = false;
            for (int j = 1; prime[j] * prime[j] <= i; j++) {
                counter += 2;
                if(i % prime[j] == 0){
                    flag = true;
                    break;  
                } 
            }

            if(!flag){
                counter++;
                prime[ptr++] = i;
            }
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("곱하기와 나눗셈을 수행한 횟수 = " + counter);

        // 두번째 개선 버전
        // int counter = 0;    //나눗셈을 실행한 수
        // int ptr = 0;    // 구한 소수의 수
        // int[] prime = new int[500]; // 구한 소수를 저장해 둘 배열

        // prime[ptr++] = 2;   // 최초의 소스는 2

        // for (int i = 3; i <= 1000; i += 2) {    // 그 다음 소수는 3, 3부터 시작해서 매번 홀수를 나누면 소수를 구할 수 있지만
        //     int j;                              // 짝수를 나누면 2로 무조건 떨어지기 때문에 3 부터 시작하기
        //     for (j = 1; j < ptr; j++) {     // 이전까지 구한 소수로 나눗셈을 실행
        //         counter++;
        //         if(i % prime[j] == 0) break;
        //     }
        //     if(ptr == j){   // 마지막까지 나눠지지 않으면 소수로 인정
        //         prime[ptr++] = i;
        //     }
        // }

        // for (int i = 0; i < ptr; i++) {
        //     System.err.println(prime[i]);
        // }
        
        // System.out.println("나눗셈을 수행한 횟수 = " + counter);

        // 첫번째 버전
        // int counter = 0;

        // for (int i = 2; i <= 100; i++) {
        //     int j;
        //     for (j = 2; j < i; j++) {
        //         counter++;
        //         if(i % j == 0) break;   //나누어 떨어지면 소수가 아님
        //     }
        //     if(i == j){ //마지막까지 나누어 떨어지지 않으면 소수
        //         System.out.println(i);
        //     }
        // }

        // System.out.println("나눗셈을 수행한 횟수 = " + counter);
    }
}