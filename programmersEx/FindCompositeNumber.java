package programmersEx;

public class FindCompositeNumber {
    public static void main(String[] args) {

        int compositeNumber = 71;

        System.out.println("합성 수 cnt : " + solution(compositeNumber));

    }

    private static int solution(int number) {
        int answer = 0;

        for(int i = 1; i <= number; i++){
            for (int j = 2; j*j <= i; j++){
                if(i % j == 0){
                    answer++;
                    break;
                }
            }
        }


        return answer;
    }
}
