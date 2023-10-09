package programmersEx;

public class NextNumber {

    public static int solution(int[] common) {
        boolean isArithmetic = true;
        int length = common.length;
        int diff = common[1] - common[0];

        for (int i = 0; i < length - 1; i++) {
            int d = common[i + 1] - common[i];

            if(d != diff){
                isArithmetic = false;
                diff = common[i + 1] / common[i];
                break;
            }
        }

        if(isArithmetic){
            return common[length - 1] + diff;
        }else{
            return common[length - 1] * diff;
        }
    }
}
