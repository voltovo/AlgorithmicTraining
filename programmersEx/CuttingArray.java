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
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i >= num1 && i <= num2) {
                answer[index] = numbers[i];
                index++;
            }
        }
        return answer;
    }
}
