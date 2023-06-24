package programmersEx;

public class LastTwoElement {

    public static int[] solution(int[] num_list){
        int[] answer = new int[num_list.length + 1];

        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }

        int last = answer[num_list.length - 1];
        int secondLast = answer[num_list.length - 2];

        answer[num_list.length] = last > secondLast ? last - secondLast : last * 2;

        return answer;
    }
}
