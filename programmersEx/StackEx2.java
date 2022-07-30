package programmersEx;

import java.util.Arrays;

public class StackEx2 {
    // Quiz Title : 주식가격
    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3};
    
        int[] result = isFallPrice(prices);
    
        System.out.println("result = " + Arrays.toString(result));
    }

    public static final int[] isFallPrice(int[]prices){
        int[] answer = {};
        answer = new int[prices.length];

        // 다른 사람 풀이 분석
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;    // 주식을 산 시점에서 부터 1씩 증감
                                // 1. 중간에 가격이 떨어진 시점
                                // 2. 배열의 끝까지 가격이 떨어 지지 않은 시점
                                // 모두 카운티이 가능 .... 대단쓰
                if(prices[i] > prices[j])
                    break;
            }
        }

        // 나의 풀이
        // for (int i = 0; i < prices.length; i++) {
        //     for (int j = i + 1; j < prices.length; j++) {
        //         if(prices[i] > prices[j]){
        //             answer[i] = j - i;
        //             break;
        //         }else if(j == prices.length - 1){
        //             answer[i] = j - i;
        //         }
        //     }
        // }
        return answer;
    }
}
