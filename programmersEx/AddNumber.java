package programmersEx;

public class AddNumber {
    public static int solution(String my_string){
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            // number인 경우
            if(Character.isDigit(c)){
                sb.append(c);
            }else{
                // number가 아닌 경우
                if(sb.length() > 0){
                    answer += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        }

        if(sb.length() > 0){
            answer += Integer.parseInt(sb.toString());
            sb.setLength(0);
        }

        return answer;
    }
}
