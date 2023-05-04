package programmersEx;

public class StringRearrang {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";

        System.out.println("두 문자열 섞기 = " + solution(str1, str2));
    }

    public static String solution(String str1, String str2) {
        // 문자열 배열로 전환
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        // 두 문자열 섞을 객체
        StringBuilder sb = new StringBuilder();
            for(int i = 0; i < str1Arr.length; i++){
                sb.append(str1Arr[i]);
                sb.append(str2Arr[i]);
            }
        return sb.toString();
    }
}
