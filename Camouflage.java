import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Camouflage {
    public static void main(String[] args) {

        //String[][] doubleArray = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] doubleArray = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "face"}};

        int result = solution(doubleArray);
        System.out.println("결과 = " + result);
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> colthesType = new HashMap<String, Integer>();
        for (int i = 0; i < clothes.length; i++) {
            String colthesTypeName = clothes[i][1];
            System.out.println(colthesTypeName);
            colthesType.put(colthesTypeName, colthesType.getOrDefault(colthesTypeName, 1) + 1);
        }
        
        Set<String> keySet = colthesType.keySet();
        for(String key: keySet){
            answer *= colthesType.get(key);
        }
        answer = answer -1;
        return answer;
    }

}
