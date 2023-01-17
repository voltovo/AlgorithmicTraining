package programmersEx;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("펙토리얼 제일 큰 정수 = " + solution(7));
    }

    private static int solution(int n){
        // 횟수 체크
        int answer = 1;
        // 자연수 펙토리얼 수행
        int factorial = 1;

        while (n >= factorial){
            answer ++;
            factorial *= answer;
        }
        // 조건문으로 실행된 한번 빼기
        // 횟수 확인을 위해서 for문 한번
        // 팩토리얼 수행을 위해서 for문 한번
        // 총 두번의 for문이 필요 할 거라고 생각했지만
        // answer로 횟수 및 정답을 유출하면서 반목문 한번 수행
        return answer - 1;
    }

}
