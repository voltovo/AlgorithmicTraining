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
        int[] answer = {};
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i + 1]){
                numList.add(arr[i]);
            }
        }
        numList.add(arr[arr.length - 1]);
        answer = new int [numList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}
