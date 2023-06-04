package programmersEx;

public class AddSpecificPort {
    public static int solution(int a, int b, boolean[] included){
        int answer = 0;

        for(int i = 0; i < included.length; i++){
            if(included[i]){
                answer += a + (i * b);
            }
        }
        return answer;
    }

}
