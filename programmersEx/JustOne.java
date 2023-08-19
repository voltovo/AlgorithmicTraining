package programmersEx;

import java.util.Arrays;
import java.util.HashMap;

public class JustOne {

    public static String solution(String s){
        StringBuilder answer = new StringBuilder();
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> countMap = new HashMap<>();

        // 문자열의 각 문자 등장 횟수를 countMap에 저장
        for(char c : charArray){
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // countMap의 value가 1인 key를 answer에 추가
        for(char c : charArray){
            if(countMap.get(c) == 1){
                answer.append(c);
            }
        }

        // 문자열 정렬
        char[] sortedCharArray = answer.toString().toCharArray();
        Arrays.sort(sortedCharArray);

        return new String(sortedCharArray);
    }
}
