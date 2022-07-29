import java.util.Scanner;

public class StepOne {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("자연수를 입력하세요.");
        int num = sc.nextInt();
        System.out.println("약수의 합  = " + solution(num));
    }

    public static int solution(int n){
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                answer += i;
                System.out.println("약수는 : " + i);
            }
        }
        return answer;
    }
}
