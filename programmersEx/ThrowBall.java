package programmersEx;

import java.util.LinkedList;
import java.util.Queue;

public class ThrowBall {
    public static int solution(int [] numbers, int k){
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for(int num : numbers) queue.add(num);

        // k번째 순서까지 반복
        int cnt = 1;
        while(cnt !=k){
            // 큐에서 두 개를 빼서 다시 넣어준다.
            // 사람을 한명 건너 뛰고 던지기 때문에 두 번 빼준다.
            queue.add(queue.poll());
            queue.add(queue.poll());
            cnt++;
        }
        answer = queue.poll();
        return answer;
    }
}
