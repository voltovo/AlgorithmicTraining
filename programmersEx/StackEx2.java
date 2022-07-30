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

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if(prices[i] > prices[j]){
                    answer[i] = j - i;
                    break;
                }else if(j == prices.length - 1){
                    answer[i] = j - i;
                }
            }
        }
        return answer;
    }
}
