package programmersEx;

import java.util.ArrayList;
import java.util.List;

public class LengthOverlapping {

    public static int solution(int[][] lines) {
        int answer = 0;
        // 2차원 배열 정렬
        for (int i = 0; i < lines.length; i++) {
            for (int j = i + 1; j < lines.length; j++) {
                if (lines[i][0] > lines[j][0]) {
                    int[] temp = lines[i];
                    lines[i] = lines[j];
                    lines[j] = temp;
                }
            }
        }

        // 겹치는 구간을 기록할 배열
        List<int[]> overlapping = new ArrayList<>();
        // 2차원 배열 겹치는 길이 계산
        for (int i = 0; i < lines.length; i++) {
            int min = 0;
            int max = 0;
            for (int j = i + 1; j < lines.length; j++) {
                if (lines[i][1] > lines[j][0] && lines[i][0] < lines[j][1]) {
                    if (lines[i][0] < lines[j][0] && lines[i][1] > lines[j][1]) {
                        min = lines[j][0];
                        max = lines[j][1];
                        answer += max - min;
                        overlapping.add(new int[]{min, max});
                    } else {
                        min = lines[j][0];
                        max = lines[i][1] > lines[j][1] ? lines[j][1] : lines[i][1];
                        answer += max - min;
                        overlapping.add(new int[]{min, max});
                    }
                }
            }

        }

        for (int i = 0; i < overlapping.size() - 1; i++) {
            if (overlapping.get(i)[1] > overlapping.get(i + 1)[0]
                && overlapping.get(i)[0] < overlapping.get(i + 1)[1]
                && overlapping.get(i)[1] < overlapping.get(i + 1)[1]) {
                answer -= overlapping.get(i)[1] - overlapping.get(i + 1)[0];
            } else if(overlapping.get(i)[1] > overlapping.get(i + 1)[0]
                && overlapping.get(i)[0] < overlapping.get(i + 1)[1]
                && overlapping.get(i)[1] >= overlapping.get(i + 1)[1]){
                answer -= overlapping.get(i + 1)[1] - overlapping.get(i + 1)[0];
            }

        }
        return answer;
    }
}
