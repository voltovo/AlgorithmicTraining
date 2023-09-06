package programmersEx;

public class CalculateTriangleLength {
    public static int solution(int[] sides){
        int answer = 0;
        int max = sides[0] > sides[1] ? sides[0] : sides[1];
        int min = sides[0] < sides[1] ? sides[0] : sides[1];
        // 두 변의 길이지 max가 제일 긴 경우
        // 나머지 한변의 길이를 구할 수 있는 경우의 수
        answer += max - (max - min);
        // 주 어진 두변을 제외하고 새로운 변의 길이가 제일 긴 경우
        // 해당 변의 길이를 구할 수 있는 경우의 수
        answer += (max + min - 1) - max;
        return answer;
    }
}
