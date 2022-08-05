package programmersEx;

import java.util.ArrayList;
import java.util.Arrays;

public class StackEx3 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        //int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 30, 5};
        //int[] speeds = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

    public static final int[] solution(int[] progresses, int[] speeds){
        int[] answer = {};
        int[] InsufficientNum = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            InsufficientNum[i] = (int)Math.ceil((100 - progresses[i]) /  (double)speeds[i]);
        }
        ArrayList<Integer> answerList = new ArrayList<>();
        System.out.println(Arrays.toString(InsufficientNum));

        for (int i = 0; i < InsufficientNum.length; i++) {
            int num = 1;
            if(InsufficientNum[i] < 0){
                continue;
            }
            for (int j = i + 1; j < InsufficientNum.length; j++) {
                if(InsufficientNum[i] >= InsufficientNum[j]){
                    InsufficientNum[j] = -1;
                    num++;
                }else{
                    break;
                }
            }
            answerList.add(num);
        }

        answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
