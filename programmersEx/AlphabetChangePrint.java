package programmersEx;

import java.util.Scanner;

public class AlphabetChangePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        //문자열 길이만큼 반복
        for(char c : a.toCharArray()){
            // 대문자면 소문자로
            if(c >= 'A' && c <= 'Z'){
                System.out.print((char)(c + 32));
            }else{
                // 소문자면 대문자로
                System.out.print((char)(c - 32));
            }
        }
    }
}
