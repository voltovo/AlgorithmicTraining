import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요소수 : ");
        int num = sc.nextInt();

        //배열 선언
        int [] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        //배열 역순
        reverse(x);
        //배열 합산
        sumOf(x);
    }

    private static void sumOf(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        System.out.println("배열의 값 합산 = " + sum);
    }

    static void swap(int[] a, int num1, int num2){
        int temp = a[num1];
        a[num1] = a[num2];
        a[num2] = temp;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("a[" + num1 + "]과 a["+ num2 + "]를 교환합니다.");
    }
    static void reverse(int[] a){
        for (int i = 0; i < a.length/2; i++) {
            swap(a, i, a.length -i -1);
        }
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
