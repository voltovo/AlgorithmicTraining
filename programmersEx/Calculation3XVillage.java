package programmersEx;

public class Calculation3XVillage {

    public static int solution(int n) {
        for (int i = 1; i <= n; i++) {
            // 3의 배수이거나 3이 들어가는 경우
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                n++;
            }
        }
        return n;
    }
}
