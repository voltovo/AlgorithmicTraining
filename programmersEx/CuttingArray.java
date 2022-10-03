package programmersEx;

import java.util.Arrays;

public class CuttingArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int num1 = 1;
        int num2 = 3;

        System.out.println("배열 자르기 : " + Arrays.toString(solution(numbers, num1, num2)));

    }

    private static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        int size = num2 - num1 + 1;
        answer = new int[size];

        // 배열에 변수를 일반적이니 한 개에서 두 개로 늘려서 처리
        for (int i = num1, j = 0; i < num2 + 1; i++) {
            answer[j] = numbers[i];
            j++;
        }
        return answer;
    }
}
