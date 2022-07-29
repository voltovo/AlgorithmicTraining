import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열 a의 요솟 수 : ");
        int num = sc.nextInt();

        int[] a = new int[num];

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        int[] b = {};

        b = copy(a,b);

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i] + " / b[" + i + "] = " + b[i]);
        }
    }

    private static int[] copy(int[] a, int[] b) {
        b = new int[a.length];

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        return b;
    }
    
}
