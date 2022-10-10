package programmersEx;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class getMaxInt {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("최대값들 끼리 곱한 값 = " + solution(numbers));
    }

    private static int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        Integer maxA = list.stream().mapToInt(i -> i).max().orElseThrow(NoSuchElementException::new);
        list.remove(maxA);
        Integer maxB = list.stream().mapToInt(i -> i).max().orElseThrow(NoSuchElementException::new);

        answer = maxA * maxB;

        return answer;
    }
}
