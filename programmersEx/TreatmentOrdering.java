package programmersEx;

import java.util.Arrays;

public class TreatmentOrdering {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};

        System.out.println("진료 순서 가져와 ~ ! = " + Arrays.toString(solution(emergency)));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = emergency.clone();
        int[] tempArray = emergency.clone();

        // emergency 큰 순서로 정렬
        for(int i = 0; i < emergency.length; i++){
            for(int j = i + 1; j < emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    int temp = emergency[i];
                    emergency[i] = emergency[j];
                    emergency[j] = temp;
                }
            }
        }

        // answer 배열에서 emergency 배열 값의 index 구하기
        for(int i = 0; i < tempArray.length; i++ ){
            for(int j = 0; j < emergency.length; j++){
                if(tempArray[i] == emergency[j]){
                    answer[i] = j + 1;
                }
            }
        }
        return answer;
    }
}
