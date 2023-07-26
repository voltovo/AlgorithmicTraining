package programmersEx;

import java.util.HashSet;
import java.util.Set;

public class FactorizationIntoPrimes {


    public static int[] solution(int n) {
        // 중복 제거를 위해 Set 사용
        Set<Integer> primeSet = new HashSet<>();

        // 2부터 n까지 나누어 떨어지는 수를 찾아서 Set에 추가
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeSet.add(i);
                n /= i;
            }
        }

        return primeSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
