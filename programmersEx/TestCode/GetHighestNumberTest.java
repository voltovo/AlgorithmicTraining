package programmersEx.TestCode;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;
import programmersEx.getHighestNumber;

public class GetHighestNumberTest {
    @Test
    public void testSolution(){
        int[] array1 = {1,2,3,2,2,2};
        int expectedAnswer1 = 2;
        assertEquals(expectedAnswer1, getHighestNumber.solution(array1));

        int[] array2 = {1,2,3,4,5};
        int expectedAnswer2 = -1;
        assertEquals(expectedAnswer2, getHighestNumber.solution(array2));
    }
}
