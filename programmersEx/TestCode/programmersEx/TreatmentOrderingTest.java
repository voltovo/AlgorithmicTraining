package programmersEx;

import static junit.framework.TestCase.assertEquals;
import junit.framework.TestCase;
import org.junit.Test;

public class TreatmentOrderingTest {

    @Test
    public void testSolution() {
        int[] array1 = {3,76,24};
        int[] expectedArray1 = {3,1,2};
        assertEquals(expectedArray1, TreatmentOrdering.solution(array1));
    }
}
