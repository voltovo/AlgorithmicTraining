package programmersEx;

public class SuccessiveNumber {

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];

        // 중심값 계산
        int center = total / num;
        // num이 짝수여부
        if (num % 2 == 0) {
            center++;
        }

        // 중심값을 기준으로 좌우로 값을 할당
        for (int i = 0; i < num; i++) {
            answer[i] = center - num / 2 + i;
        }

        return answer;
    }
}
