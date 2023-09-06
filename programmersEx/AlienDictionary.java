package programmersEx;

public class AlienDictionary {
    public static int solution(String[] spell, String[] dic){
        for(String str : dic){
            boolean isMatched = true;
            for(String s : spell){
                if(!str.contains(s)){
                    isMatched = false;
                    break;
                }
            }
            if(isMatched){
                return 1;
            }
        }
        return 2;
    }
}
