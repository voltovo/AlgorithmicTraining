package programmersEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("배열 회전 : " + Arrays.toString(solution(numbers, "left")));

    }

    private static int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        if("right".equals(direction)){
            int temp = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, temp);
        }else{
            int temp = list.get(0);
            list.remove(0);
            list.add(list.size(), temp);
        }

        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
