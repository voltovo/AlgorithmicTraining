package programmersEx;

public class ProcessingCode {
    public static String solution(String code) {

        // 문자열 조합 모드
        boolean mode = false;
        // 문자열 조합
        StringBuilder sb = new StringBuilder();
        // 1. code를 한 글자씩 쪼개서 배열에 넣어준다.
        String[] codeArray = code.split("");
        for(int i = 0; i < codeArray.length; i++){
            // i가 1이면 모드 전환
            if("1".equals(codeArray[i])){
                mode = !mode;
                continue;
            }
            // i가 짝수이고 모드가 0인 경우 (false)
            if(i % 2 == 0 && !mode){
                sb.append(codeArray[i]);
            }else if(i % 2 == 1 && mode){
                // i가 홀수이고 모드가 1인 경우 (true)
                sb.append(codeArray[i]);
            }

        }
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}
