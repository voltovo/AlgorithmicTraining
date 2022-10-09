package programmersEx;

public class sumOdd {
    public static void main(String[] args) {
        String[] strlist = { "We", "are", "the", "world!" };

        System.out.println("배열 자르기 : " + Arrays.toString(solution(strlist)));
    }

    private static int[] solution(String[] strlist) {

        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
