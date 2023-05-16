package stayfolio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StayfolioOneTest {

    @Test
    public void testSolution() {
        String[] arr = {"stayfolio", "hand", "curation", "tuna", "yes", "no", "style", "stash"};
        String[] expectedAnswer = {"no", "yes", "hand", "tuna", "stash", "style", "curation", "stayfolio"};
        assertEquals(expectedAnswer, StayfolioOne.solution(arr));
    }
}
