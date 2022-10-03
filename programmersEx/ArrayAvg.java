package programmersEx;

public class ArrayAvg {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        Double c = new Double(a);
        Double d = new Double(b);
        double result = Double.valueOf(a) / Double.valueOf(b);
        System.out.println(result);
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
