package programmersEx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiceGameTest {
    @Test
    public void solution() {
        int a = 4;
        int b = 4;
        int c = 4;
        int expectedAnswer = 110592;
        assertEquals(expectedAnswer, DiceGame.solution(a, b, c));
    }
}
