import java.util.Arrays;
import java.util.Scanner;

public class StepTwo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        // int[][] arr1 = {{1},{2}};
        // int[][] arr2 = {{3},{4}};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("result = " + Arrays.toString(solution(arr1, arr2)[i]));
        }
        
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        // answer = new int[arr1.length][arr1.length];
        answer = new int[arr1.length][arr1[0].length];;
        for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer[i].length; j++) {
                    System.out.println("arr1 = " + arr1[i][j]);
                    System.out.println("arr2 = " + arr2[i][j]);
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }

        }
        return answer;
    }
}
