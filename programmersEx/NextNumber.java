package programmersEx;

public class NextNumber {

    public static int solution(int[] common) {
        boolean isArithmetic = true;
        int length = common.length;
        int diff1 = common[1] - common[0];
        int diff2 = common[2] - common[1];

        if (diff1 == diff2) {
            return common[length - 1] + diff2;
        } else {
            return common[length - 1] * common[2] / common[1];
        }
    }
}
