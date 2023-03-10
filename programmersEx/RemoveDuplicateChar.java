package programmersEx;

public class RemoveDuplicateChar {

    public static String solution(String my_string){
        String answer = "";
        // 문자열 길이만큼 반복
        for (int i = 0; i< my_string.length(); i++){
            // answer에 없으면 추가
            if(!answer.contains(Character.toString(my_string.charAt(i)))){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

}
