package programmersEx;

import java.util.Scanner;

public class PrintOutOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numberStr = sc.nextLine();
        String[] numberArray = numberStr.split(" ");
        System.out.println("a = " + numberArray[0]);
        System.out.println("b = " + numberArray[1]);
    }
}
