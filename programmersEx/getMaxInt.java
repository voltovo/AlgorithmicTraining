package programmersEx;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class getMaxInt {
    public static void main(String[] args) {

        // int[] numbers = { 1, 2, 3, 4, 5 };
        int[] numbers = { 0, 31, 24, 10, 1, 9 };

        System.out.println("최대값들 끼리 곱한 값 = " + solution(numbers));
    }

    private static int solution(int[] numbers) {
        int answer = 0;
        int size = numbers.length;
        Arrays.sort(numbers);
        System.out.println("정렬 = " + Arrays.toString(numbers));
        int maxA = numbers[size - 1];
        int maxB = numbers[size - 2];

        answer = maxA * maxB;

        return answer;
    }
}
