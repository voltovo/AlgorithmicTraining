package programmersEx;

public class DividePizza {
    public static void main(String[] args) {
        int people = 10;

        System.out.println("νΌμ ν μ : " + solution(people));

    }

    private static int solution(int people) {
        int answer = 1;
        boolean isCounting = true;
        int piece = 6;
        int plusPeople = 0;
        while(isCounting){
            plusPeople = people * answer;
            if(plusPeople % piece == 0){
                isCounting = false;
            }else{
                answer++;
            }
        }

        answer = plusPeople / piece;

        return answer;
    }
}
