package programmersEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthNumber {

    public static int[] solution(int[] array, int[][] commands) {
        int commandSize = commands.length;
        int[] answer = new int[commandSize];

        for (int i = 0; i < commandSize; i++) {
            int startIndex = commands[i][0] - 1;
            int endIndex = commands[i][1];
            int findIndex = commands[i][2] - 1;

            List<Integer> numberArray = new ArrayList<>();

            for (int j = startIndex; j < endIndex; j++) {
                numberArray.add(array[j]);
            }
            Collections.sort(numberArray);
            answer[i] = numberArray.get(findIndex);
        }
        return answer;
    }
}
