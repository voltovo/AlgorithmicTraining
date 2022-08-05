package programmersEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class StackEx3 {
    public static void main(String[] args) {
        //int[] progresses = {93, 30, 55};
        int[] progresses = {95, 90, 99, 99, 80, 99};
        //int[] speeds = {1, 30, 5};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

    public static final int[] solution(int[] progresses, int[] speeds){
        int[] answer = {};
        ArrayList<Integer> answerList = new ArrayList<>();
        // 다른 사람 풀이
        Queue<Integer> q = new LinkedList<>();  //가장 먼저 넣은 데이터를 가장 먼저 꺼낼 수 있는 구조 FIFO

        for (int i = 0; i < speeds.length; i++) {
            // 100% 완료 까지 남은 날짜 / speeds
            double remain = (100 - progresses[i]) / (double)speeds[i];
            // 올림 처리
            int date = (int)Math.ceil(remain);

            // 처음엔 통과
            // 두번째 부터 첫번째 남은 날짜와 두번째 남은 날짜 비교
            if(!q.isEmpty() && q.peek() < date){
                //현재 큐에 담아 있는 사이즈 더하기
                answerList.add(q.size());
                // 큐 초기화
                q.clear();
            }

            // 큐에 date 추가
            // 큐 초기화 후 다음 남은 date 추가
            q.offer(date);
        }

        // 마지막에 큐에 들어 있는 사이즈 추가
        answerList.add(q.size());


        // 나의 풀이
        // int[] InsufficientNum = new int[progresses.length];

        // for (int i = 0; i < progresses.length; i++) {
        //     InsufficientNum[i] = (int)Math.ceil((100 - progresses[i]) /  (double)speeds[i]);
        // }
        // System.out.println(Arrays.toString(InsufficientNum));

        // for (int i = 0; i < InsufficientNum.length; i++) {
        //     int num = 1;
        //     if(InsufficientNum[i] < 0){
        //         continue;
        //     }
        //     for (int j = i + 1; j < InsufficientNum.length; j++) {
        //         if(InsufficientNum[i] >= InsufficientNum[j]){
        //             InsufficientNum[j] = -1;
        //             num++;
        //         }else{
        //             break;
        //         }
        //     }
        //     answerList.add(num);
        // }

        answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
