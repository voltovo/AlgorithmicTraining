package programmersEx;

public class ParenthesesCheck {
    public static boolean solution(String s){
        int sum = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                sum++;
            } else if (ch == ')') {
                if(sum == 0){
                    return false;
                }
                sum--;
            }
        }

        return sum == 0;
    }
}
