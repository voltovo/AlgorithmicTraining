package programmersEx;

import java.util.Arrays;

public class AtoB {

    public static int solution(String before, String after){
        // 문자열을 char 배열로 변환
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        // 배열을 정렬
        Arrays.sort(a);
        Arrays.sort(b);

        // 정렬된 배열을 문자열로 변환 후 비교
        return new String(a).equals(new String(b)) ? 1 :0;
    }
}
