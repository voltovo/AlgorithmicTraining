package programmersEx;

import java.util.Stack;
import java.util.StringTokenizer;

public class ControlZ {
    public static int solution(String s) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        StringTokenizer tokenizer = new StringTokenizer(s, " ");

        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            if("Z".equals(token)) {
                stack.pop();
            }else{
                stack.push(Integer.parseInt(token));
            }
        }

        while(!stack.isEmpty()){
            answer += stack.pop();
        }
        return answer;
    }
}
