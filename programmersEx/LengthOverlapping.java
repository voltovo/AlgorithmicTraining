package programmersEx;

import java.util.HashMap;

public class LengthOverlapping {

    public static int solution(int[][] lines) {
        int answer = 0;
        HashMap<Integer, Integer> lineMap = new HashMap<>();

        for(int[] line : lines){
            // 시작점
            int from = Math.min(line[0], line[1]);
            // 끝점
            int to = Math.max(line[0], line[1]);

            // 시작부터 끝까지 1씩 증가하면서 해당하는 key값에 value를 1씩 증가시킨다.
            for (int i = from; i < to; i++) {
                lineMap.put(i, lineMap.getOrDefault(i, 0) + 1);
            }
        }

        // value값이 2 이상인 경우가 중복되는 부분이다.
        for(int value : lineMap.values()){
            if(value >= 2){
                answer++;
            }
        }
        return answer;
    }
}
