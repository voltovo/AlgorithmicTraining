package programmersEx;

public class QuizOX {
    public static String[] solution(String[] quiz){
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++){
            String[] quizStrArray = quiz[i].split(" ");

            int operand1 = Integer.parseInt(quizStrArray[0]);
            int operand2 = Integer.parseInt(quizStrArray[2]);
            int result = operand1 + ("-".equals(quizStrArray[1]) ? -operand2 : operand2);

            answer[i] = result == Integer.parseInt(quizStrArray[4]) ? "O" : "X";
        }
        return answer;
    }
}
