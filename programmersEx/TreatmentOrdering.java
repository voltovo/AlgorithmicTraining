package programmersEx;

import java.util.Arrays;

public class TreatmentOrdering {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};

        System.out.println("진료 순서 가져와 ~ ! = " + Arrays.toString(solution(emergency)));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            if(answer[i] != 0){
                continue;
            }
            // 한바퀴 돌고 idx 리셋
            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                // 기준이되는 수 보다 크면 카운팅
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}
