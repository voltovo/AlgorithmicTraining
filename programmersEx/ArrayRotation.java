package programmersEx;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("배열 회전 : " + Arrays.toString(solution(numbers, "right")));

    }

    private static int[] solution(int[] numbers, String direction) {
        int[] answer = {};

        answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            if("left".equals(direction)){
                if(i == 0){
                    answer[numbers.length - 1] = numbers[i];
                }else{
                    answer[i - 1] = numbers[i];
                }
            }else{
                if(i == numbers.length - 1){
                    answer[0] = numbers[i];
                }else{
                    answer[i + 1] = numbers[i];
                }
            }
        }

        return answer;
    }
}
