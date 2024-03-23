package programmersEx;

public class ElementNth {
    public static int[] solution(int[] num_list, int n) {
        /**
         * 문제 설명
         * 정수 리스트 num_list와 정수 n이 주어질 때,
         * n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return
         */
        int index = n - 1;
        int[] answer = new int[num_list.length - (index)];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[index + i];
            System.out.println("answer[i] = " + answer[i] + ", i = " + i);
        }

        return answer;
    }
}
