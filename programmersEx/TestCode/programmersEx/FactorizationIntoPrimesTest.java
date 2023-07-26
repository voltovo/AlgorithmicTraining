package programmersEx;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorizationIntoPrimesTest {

    @Test
    public void solution() {
//        int n = 12;
//        int[] expectedAnswer1 = {2, 3};
//        assertArrayEquals(expectedAnswer1, FactorizationIntoPrimes.solution(n));

        int m = 17;
        int[] expectedAnswer2 = {17};
        assertArrayEquals(expectedAnswer2, FactorizationIntoPrimes.solution(m));
    }
}
