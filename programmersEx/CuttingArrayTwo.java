package programmersEx;

public class CuttingArrayTwo {
    public static String[] solution(String my_str, int n) {
        int strLength = my_str.length();
        int arrayLength = (strLength + n - 1) / n; // 올림 연산
        String[] answer = new String[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int startIndex = i * n;
            int endIndex = Math.min(startIndex + n, strLength);
            answer[i] = my_str.substring(startIndex, endIndex);
        }
        return answer;
    }
}
