package programmersEx;

public class Babbling {
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] words = { "aya", "ye", "woo", "ma" };

        for (String string : babbling) {
            int matchCnt = 0;
            for (String word : words) {
                if (string.contains(word)) {
                    string = string.replaceAll(word, "1");
                    matchCnt++;
                }
            }
            if (matchCnt == string.length()) {
                answer++;
            }
        }
        return answer;
    }
}
