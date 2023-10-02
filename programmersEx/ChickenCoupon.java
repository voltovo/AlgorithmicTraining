package programmersEx;

public class ChickenCoupon {
    public static int solution(int chicken) {
        int maxServiceChichken = 0;

        while (chicken > 9) {
            int serviceChicken = chicken / 10;
            maxServiceChichken += serviceChicken;
            chicken = serviceChicken + (chicken % 10);
        }

        return maxServiceChichken;
    }
}
