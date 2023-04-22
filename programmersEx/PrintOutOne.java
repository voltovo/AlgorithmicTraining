package programmersEx;

import java.util.Scanner;

public class PrintOutOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력 받은 값 중에 공백 제거 하고 int만 가지고 옴
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
