package programmersEx;

public class decryption {

    public static void main(String[] args) {
        String cipher = "pfqallllabwaoclk";
        int code = 2;

        System.out.println("암호 해독 결과 값 : " + solution(cipher, code));

    }

    private static String solution(String cipher, int code) {
        String answer = "";
        // 암호 문자열의 총 길이
        int cipherLength = cipher.length();
        // 해독 글자가 있는 code의 수
        int codeCount = cipherLength / code;
        // 해독 글자 담을 StringBuffer
        StringBuffer sb = new StringBuffer();

        // 해독 글자가 code의 배수 이기 때문에 반복문 실행
        for (int i = 1; i <= codeCount; i++) {
            // code의 배수 구하기
            int codeIndex = code * i;
            // 해독 글자 get
            sb.append(cipher.charAt(codeIndex - 1));
        }

        answer = sb.toString();

        return answer;
    }

}
