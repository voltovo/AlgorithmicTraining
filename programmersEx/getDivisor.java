package programmersEx;

import java.util.ArrayList;
import java.util.Arrays;

public class getDivisor {
    public static void main(String[] args) {
        System.out.println("약수 구하기 : " + Arrays.toString(solution(24)));
    }

    private static int[] solution(int n) {
        int[] answer = {};
        // sqrt를 사용하는 이유
        // 인자로 전달된 값의 제곱근을 리턴한다 (ex : 인자 = 100, 리턴 = 10)
        int sqrt = (int) Math.sqrt(n);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= sqrt; i++) {
            // 해당 약수를 가지고 입력받은 값을 나누게 될 경우 나오는 결과 값 역시 약수
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }

        // 약수를 리스트에 넣어주고 스트림 , 정렬, int로 변환, 배열로 변경
        answer = list.stream().sorted().mapToInt(i -> i).toArray();
        return answer;
    }
}
