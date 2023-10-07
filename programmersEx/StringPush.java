package programmersEx;

public class StringPush {

    public static int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }
        int len = A.length();
        for (int i = 1; i <= len; i++) {
            String shifted = A.substring(len - i) + A.substring(0, len - i);
            if (shifted.equals(B)) {
                return i;
            }
        }
        return -1; // A를 순환하여도 B와 일치하지 않음
    }
}
