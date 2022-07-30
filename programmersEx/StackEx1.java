package programmersEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class StackEx1 {
    // Quiz Title : 같은 숫자는 싫어 

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        //int[] arr = {4,4,4,3,3};
        int[] result = notAllowSameNumber(arr);

        System.out.println("result = " + Arrays.toString(result));
    }
    public static final int[] notAllowSameNumber(int[] arr){
        //다른 사람 풀이 분석
        int[] answer = {};
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;    //문제에서 조건으로 0 ~ 9 만 입력한다고 했으므로 겹치지 않는 10으로 비교하기 위해서 지정
        for (int num : arr) {
            if(preNum != num){
                tempList.add(num);
            }
            // preNum에 num을 대입해서 그 다음 배열의 값과 비교하기
            preNum = num;
        }
        
        answer = new int[tempList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = tempList.get(i);
        }
        
        
        
        // 나의 풀이
        // int[] answer = {};
        // ArrayList<Integer> numList = new ArrayList<>();
        // for (int i = 0; i < arr.length - 1; i++) {
        //     if(arr[i] != arr[i + 1]){
        //         numList.add(arr[i]);
        //     }
        // }
        // numList.add(arr[arr.length - 1]);
        // answer = new int [numList.size()];

        // for (int i = 0; i < answer.length; i++) {
        //     answer[i] = numList.get(i);
        // }
        
        return answer;
    }
}
