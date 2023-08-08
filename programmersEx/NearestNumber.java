package programmersEx;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class NearestNumber {
    public static int solution(int[] array, int n){
        Map<Integer, Integer> map = new HashMap<>(array.length);
        for(int num : array){
            int diff = Math.abs(num - n);
            map.put(num, diff);
        }

        return map.keySet().stream()
            .min(Comparator.comparing(map::get).thenComparingInt(a -> (int) a))
            .orElse(null);
    }
}
