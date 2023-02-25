package programmersEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class getHighestNumber {
    public static void main(String[] args) {
        int[] array = {1};
        System.out.println("제일 많은 값은 = " + solution(array));
    }

    private static int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();

        // 배열의 수 카운팅
        for (int i = 0; i < array.length; i++){
            int number = array[i];
            if(numberMap.containsKey(number)){
                numberMap.put(number, (int)numberMap.get(number) + 1);
            }else{
                numberMap.put(number, 1);
            }
        }

        // 제일 많은 횟수
        int highestValue = 0;
        // 카운팅 된 맵에서 제일 큰 수 구하기
        List<Integer> highestKeyList = new ArrayList<>();
        Iterator<Entry<Integer, Integer>> it = numberMap.entrySet().iterator();
        while(it.hasNext()){
            Entry<Integer, Integer> entrySet = (Entry<Integer, Integer>) it.next();
            if(highestValue < entrySet.getValue()){
                highestValue = entrySet.getValue();
            }
        }

        // 제일 큰 수가 몇개 있는지 구하기
        Iterator<Entry<Integer, Integer>> it2 = numberMap.entrySet().iterator();
        while(it2.hasNext()){
            Entry<Integer, Integer> entrySet = (Entry<Integer, Integer>) it2.next();
            if(highestValue == entrySet.getValue()){
                highestKeyList.add(entrySet.getKey());
            }
        }

        // 제일 큰 수가 두개 이상이면 -1 반환
        if(highestKeyList.size() > 1){
            answer = -1;
        }else{
            answer = highestKeyList.get(0);
        }

        return answer;
    }
}
