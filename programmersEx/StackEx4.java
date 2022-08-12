package programmersEx;

import java.util.Collections;
import java.util.PriorityQueue;

public class StackEx4 {
    public static void main(String[] args) {
        
        // int[] priorities = {2,1,3,2};
        // int location = 2;
        int[] priorities = {1,1,9,1,1,1};
        int location = 0;

        System.out.println("resutl = " + solution(priorities, location));
    }

    public static final int solution(int[] priorities, int location){
        int answer = 1;
        // 내림차순으로 정렬되는 Queue 생성
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            // 배열을 순차적으로 Queue에 insert
            q.add(priorities[i]);
        }

        while (!q.isEmpty()) {
            //변경되지 않은 배열과 내림차순 정렬되어 있는 Queue 비교
            for (int i = 0; i < priorities.length; i++) {
                //높은 순서대로 배열의 값과 맞는지 비교
                //제일 높은 배열의 인덱스부터 뒤로 진행 
                //for문이 다 돌았지만 queue가 비어있지 않으면 배열의 앞에서부터 다시 진행
                if (q.peek() == priorities[i]) {

                    if (i == location) {
                        return answer;
                    }
                    answer++;
                    //높은 순서대로 Queue에서 제거
                    q.poll();
                }
            }
        }
        return answer;
    }
}
