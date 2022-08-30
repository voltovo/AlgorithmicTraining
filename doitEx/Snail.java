package doitEx;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
        int days = 0;

        while(y < x){
            y += 7;
            days++;
            if(y >= x){
                break;
            }
            y -= 2;
        }

        System.out.println("days = " + days);
    }
}
