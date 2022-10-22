package programmersEx;

import java.util.Arrays;

public class 외계행성의나이 {
    public static void main(String[] args) {
        int age = 23;

        System.out.println("외계 행성의 나이 : " + solution(age));

    }

    private static String solution(int age) {
        String answer = "";

        String ageStr = Integer.toString(age);

        for(int i = 0; i < ageStr.length(); i++){
            int num = ageStr.charAt(i) - '0';
            answer += (char)(num + 97);
        }
        return answer;
    }
}
