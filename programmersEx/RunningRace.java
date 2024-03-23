package programmersEx;

import java.util.HashMap;
import java.util.Map;

public class RunningRace {

    public static String[] solution(String[] players, String[] callings) {
        // 호출 순서대로 순위를 변경해야 한다
        Map<String, Integer> playerIndexMap = new HashMap<>();

        // 선수 이름과 인덱스를 매핑
        for (int i = 0; i < players.length; i++) {
            playerIndexMap.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            int playerIndex = playerIndexMap.get(callings[i]);
            if (playerIndex > 0) {
                String tempPlayer = players[playerIndex - 1];
                players[playerIndex - 1] = players[playerIndex];
                players[playerIndex] = tempPlayer;

                // 인덱스 수정
                playerIndexMap.put(callings[i], playerIndex - 1);
                playerIndexMap.put(tempPlayer, playerIndex);
            }
        }

        return players;
    }
}
