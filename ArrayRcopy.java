import java.util.Scanner;

public class ArrayRcopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열 a의 요솟 수 : ");
        int numa = sc.nextInt();

        int[] a = new int[numa];

        for (int i = 0; i < numa; i++) {
            System.out.println("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.println("배열 b의 요솟 수 : ");
        int numb = sc.nextInt();

        int[] b = new int[numb];

        for (int i = 0; i < numb; i++) {
            System.out.println("b[" + i + "] : ");
            b[i] = sc.nextInt();
        }

        rcopy(a,b);

        System.out.println("배열 b의 요소를 배열 a에 역순으로 복사 완료");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void rcopy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;

        for (int i = 0; i < num; i++) {
            a[i] = b[b.length - 1 - i];
        }
    }
}
