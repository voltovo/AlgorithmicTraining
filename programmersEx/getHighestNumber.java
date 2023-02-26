package programmersEx;

import java.util.HashMap;

public class getHighestNumber {
    public static void main(String[] args) {
        int[] array = {1,2,1,2};
        System.out.println("제일 많은 값은 = " + solution(array));
    }

    private static int solution(int[] array) {
        int answer = 0;
        int maxCount = 0;
        // 숫자당 카운팅 저장할 맵 선언
        HashMap<Integer, Integer> numberMap = new HashMap<>();

        for(int number : array){
            // 맵에 key값이 있으면 +1 없으면 0
            int count = numberMap.getOrDefault(number, 0) + 1;

            // 제일 많은 수
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }else if(count == maxCount){
                // 맵에 있는 key값에서 카운팅 한 제일 많은 수가 중복되면 -1
                answer = -1;
            }
            // 맵에 기록
            numberMap.put(number, count);
        }


        return answer;
    }
}
