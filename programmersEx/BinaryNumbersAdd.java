package programmersEx;

public class BinaryNumbersAdd {
    public static String solution(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        int carry = 0; // 올림수

        int i = bin1.length() - 1, j = bin2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int bit1 = i >= 0 ? Character.getNumericValue(bin1.charAt(i--)) : 0;
            int bit2 = j >= 0 ? Character.getNumericValue(bin2.charAt(j--)) : 0;

            int sum = bit1 + bit2 + carry;
            result.insert(0, sum % 2); // 현재 비트를 결과 문자열의 가장 앞에 추가
            carry = sum / 2; // 다음 비트로 넘길 올림수 계산
        }

        return result.toString();
    }
}
