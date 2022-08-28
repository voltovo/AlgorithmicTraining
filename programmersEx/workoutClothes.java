package programmersEx;

import java.util.Arrays;

public class workoutClothes {
    public static void main(String[] args) {
        int[] lost = {2, 3};
        int[] reserve = {4, 3};
        int people = 4;

        System.out.println("resutl = " + solution(people, lost, reserve));
    }

    public static final int solution(int n, int[] lost, int[] reserve){
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);

        System.out.println("lost = " + Arrays.toString(lost));
        System.out.println("reserve = " + Arrays.toString(reserve));

        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if(reserve[i] == lost[j]){
                    answer++;
                    lost[j] = -1;
                    reserve[i] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] - 1 == lost[j] || reserve[i] + 1 == lost[j]) {
                    answer++;
                    lost[j] = -1;
                    reserve[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}
