package programmersEx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DifferentValuesDependingOddNumberTest {

    @Test
    public void solution() {
        int n = 10;
        int expectedAnswer = 220;
        assertEquals(expectedAnswer, DifferentValuesDependingOddNumber.solution(n));
    }
}
