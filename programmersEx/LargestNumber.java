package programmersEx;

import java.util.Arrays;

public class LargestNumber {

    public static String solution(int[] numbers) {
        int count = numbers.length;
        String[] array = new String[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(array, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

        if (array[0].equals("0")) {
            return "0";
        }

        return combineArray(array);
    }

    private static String combineArray(String[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (String num : numbers) {
            sb.append(num);
        }
        return sb.toString();
    }
}
