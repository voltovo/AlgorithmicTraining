package programmersEx;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("펙토리얼 제일 큰 정수 = " + solution(3628800));
    }

    private static int solution(int n){
        int answer = 1;
        for (int i = 1; i <= n; i++){
            for (int j = i; j > 0; j--){
                answer *= j;
            }
            System.out.println("answer = " + answer);
            if(n < answer){
                answer = i -1;
                break;
            }
            answer = 1;
        }
        return answer;
    }

}
