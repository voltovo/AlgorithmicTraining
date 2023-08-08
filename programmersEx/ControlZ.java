package programmersEx;

import java.util.StringTokenizer;

public class ControlZ {
    public static int solution(String s) {
        int answer = 0;
        int prev = 0;

        // 데이터가 많은 경우 StringTokenizer가 더 빠름
        // String.split()은 문자열을 다시 배열로 반환하기 때문에 느림
        StringTokenizer tokenizer = new StringTokenizer(s, " ");
        while (tokenizer.hasMoreTokens()){
            String str = tokenizer.nextToken();
            if("Z".equals(str)){
                answer -= prev;
            }else{
                prev = Integer.parseInt(str);
                answer += prev;
            }
        }
        return answer;
    }
}
