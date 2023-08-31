package programmersEx;

public class CalculationPolynomial {

    public static String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();
        int sumNumber = 0;
        int sumX = 0;

        // 다항식 여부 체크
        if (polynomial.contains("+")) {
            String[] strArray = (polynomial.replaceAll(" ", "")).split("\\+");

            for (String str : strArray) {
                // x가 있는 경우
                if (str.contains("x")) {
                    // x 앞에 숫자가 있는 경우
                    sumX +=
                        str.length() > 1 ? Integer.parseInt(str.substring(0, str.indexOf("x"))) : 1;
                } else {
                    // x가 없는 경우
                    sumNumber += Integer.parseInt(str);
                }
            }

            if (sumX != 0) {
                if (sumX == 1) {
                    answer.append("x");
                } else {
                    answer.append(sumX).append("x");
                }
            }

            if (sumNumber != 0) {
                if (sumX != 0) {
                    answer.append(" + ");
                }
                answer.append(sumNumber);
            }
        } else {
            answer.append(polynomial);
        }

        return answer.toString();
    }
}
