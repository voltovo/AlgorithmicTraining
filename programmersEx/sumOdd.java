package programmersEx;

import java.util.Arrays;

public class sumOdd {
    public static void main(String[] args) {
        int[] num_list = { 1, 2, 3, 4, 5 };

        System.out.println("배열 자르기 : " + Arrays.toString(solution(num_list)));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0;
        int even = 0;

        // 반목문을 통해서 짝수 홀수 증감
        for (int i = 0; i < num_list.length; i++) {
            // 짝수 홀수만 들어가므로 배열의 길이는 2
            // num_list의 값을 2로 나눈 나머지는 0 아니면 1
            // 배열의 길이가 2인 배열에 차례대로 증감 가능...... 이건 생각 못함....
            answer[num_list[i] % 2]++;
        }
        return answer;
    }
}
