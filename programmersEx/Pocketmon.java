package programmersEx;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pocketmon {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};

        System.out.println("result = " + solution(nums));
    }

    private static int solution(int[] nums) {
        int answer = 0;
        answer = nums.length / 2;
        Set numSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
           numSet.add(nums[i]);
        }

        // Iterator it = numSet.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next() + " ");
        // }

        answer = answer < numSet.size() ? answer : numSet.size();

        return answer;
    }
}
