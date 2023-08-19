package programmersEx;

public class ComputeString {
    public static int solution(String my_string){
        int answer = 0;
        String[] strArray = my_string.split(" ");
        // 양수면 1, 음수면 -1
        int sign = 1;

        for(String str : strArray){
            if("+".equals(str)){
                sign = 1;
            }else if("-".equals(str)){
                sign = -1;
            }else{
                answer += sign * Integer.parseInt(str);
            }
        }

        return answer;
    }
}
