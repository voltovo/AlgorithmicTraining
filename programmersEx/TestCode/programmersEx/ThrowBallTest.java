package programmersEx;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThrowBallTest {

    @Test
    public void solution() {
        int[] numbers1 = {1,2,3};
        int k1 = 2;
        int expected1 = 3;
        assertEquals(expected1, ThrowBall.solution(numbers1, k1));

        int[] numbers2 = {1,2,3,4,5,6};
        int k2 = 5;
        int expected2 = 3;
        assertEquals(expected2, ThrowBall.solution(numbers2, k2));
    }
}
