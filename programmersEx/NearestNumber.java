package programmersEx;

import java.util.Arrays;

public class NearestNumber {
    public static int solution(int[] array, int n){
        int answer = 0;
        // 오른차순으로 정렬
        Arrays.sort(array);
        for(int i = 1; i < array.length; i++){
            // n과 array[0]의 차이가 n과 array[i]의 차이보다 크면 array[0]을 array[i]로 바꿈
            if(Math.abs(n - array[0]) > Math.abs(n - array[i])){
                // 더 가까운 수를 바꿔줌
                array[0] = array[i];
            }
        }

        // for문 종료후 가장 가까운 수가 array[0]에 저장되어 있음
        return array[0];
    }
}
