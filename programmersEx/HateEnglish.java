package programmersEx;

public class HateEnglish {
    public static long solution(String numbers) {
        long answer = 0;
        String[] englishStrArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // 영어 스펠링 중복이 없으므로, 해당 영어 스펠링을 숫자로 바꿔줌
        for(int i = 0; i < englishStrArray.length; i++){
            numbers = numbers.replaceAll(englishStrArray[i], String.valueOf(i));
        }

        answer = Long.parseLong(numbers);
        return answer;
    }
}
