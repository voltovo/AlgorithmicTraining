package programmersEx;

public class MorseCode {

    public static void main(String[] args) {
        String letter =  ".--. -.-- - .... --- -.";

        System.out.println("해독된 문자 = " + solution(letter));
    }

    private static String solution(String letter) {
        String answer = "";
        String[] letterArray = letter.split(" ");
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."};

        for(int i = 0; i < letterArray.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(letterArray[i].equals(morse[j])){
                    int num = 97 + j;
                    answer += String.valueOf((char)num);
                }
            }
        }
        return answer;
    }
}
