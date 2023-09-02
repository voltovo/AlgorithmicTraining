package programmersEx;

public class AddNumber {
    public static int solution(String my_string){
        int answer = 0;
        // 숫자만 남기고 모두 공백으로 치환
        String[] strArray = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String str : strArray){
            // 공벽을 준 경우 ""이 들어가기 때문에 이를 방지하기 위해 if문을 추가
            if(!str.equals("")){
                answer += Integer.parseInt(str);
            }
        }

        return answer;
    }
}
