package programmersEx;

public class InsufficientAmount {
    public static long solution(int price, int money, int count){
        // 가우스 합을 이용
        //long sum = (long) price * count * (count + 1) / 2;

        return Math.max((long) price * count * (count + 1) / 2 - money, 0);
    }
}
