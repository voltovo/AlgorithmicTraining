package programmersEx;

public class AtoB {

    public static int solution(String before, String after){
        int answer = 0;
        StringBuffer transferString = new StringBuffer(after);
        // before 문자열 길이만큼 반복
        for(int i = 0; i < before.length(); i++){
            // before 문자열에 있는 문자가 transferString 문자열에 있으면
            int charIndex = transferString.indexOf(Character.toString(before.charAt(i)));
            if(charIndex != -1){
                // transferString 문자열에서 해당 문자를 제거
                transferString.deleteCharAt(charIndex);
            }
        }

        // transferString 문자열 길이가 0이면 1 아니면 0
        if(transferString.length() == 0){
            answer = 1;
        }

        return answer;
    }
}
