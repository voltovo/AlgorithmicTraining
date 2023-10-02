package programmersEx;

public class KCount {
    public static int solution(int i, int j, int k) {
        int answer = 0;
        for (int num = i; num <= j; num++) {
            int currentNum = num;

            while (currentNum > 0) {
                int digit = currentNum % 10;
                if (digit == k) {
                    answer++;
                }

                currentNum /= 10;
            }
        }
        return answer;
    }
}
