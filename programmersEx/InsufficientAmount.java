package programmersEx;

public class InsufficientAmount {
    public static long solution(int price, int money, int count){
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        if(sum > money){
            return sum - money;
        }else{
            return 0;
        }
    }
}
