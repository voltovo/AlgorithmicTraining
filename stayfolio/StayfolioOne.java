package stayfolio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StayfolioOne {
    public static String[] solution(String[] arr) {
        // 중복된 단어 제거
        Set<String> uniqueTexts = new HashSet<String>(Arrays.asList(arr));

        // 길이가 짧은 순으로 정렬
        List<String> sortedList = new ArrayList<String>(uniqueTexts);
        sortedList.sort(Comparator.comparing(String::length));

        // 정답 배열에 담기
        String[] answer = new String[sortedList.size()];
        for(int i = 0; i < sortedList.size(); i++){
            for(int j = i + 1; j < sortedList.size(); j++){
                if(sortedList.get(i).length() == sortedList.get(j).length()){
                    if(sortedList.get(i).compareTo(sortedList.get(j)) > 0){
                        String temp = sortedList.get(i);
                        sortedList.set(i, sortedList.get(j));
                        sortedList.set(j, temp);
                    }
                }
            }
            answer[i] = sortedList.get(i);
        }

        return answer;
    }
}
