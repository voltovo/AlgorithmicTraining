package programmersEx;

public class ArrayAvg {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("배열의 평균 값 : " + solution(numbers));
    }

    private static double solution(int[] numbers) {
        double answer = 0;
        int size = numbers.length;
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
        answer = sum / size;
        return answer;
    }
}
