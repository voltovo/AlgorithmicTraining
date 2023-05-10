package programmersEx;

public class DifferentValuesDependingOddNumber {
    public static int solution(int n) {
        int answer = 0;
        boolean isEven = (n % 2 == 0);

        for(int i = 1; i <= n; i++){
            if(isEven && (i % 2 == 0)){
                answer += (i * i);
            }else if(!isEven && (i % 2 == 1)){
                answer += i;
            }
        }
        return answer;
    }
}
