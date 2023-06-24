package programmersEx;

import static org.junit.Assert.*;

import org.junit.Test;

public class LastTwoElementTest {

    @Test
    public void solution() {
        int[] array1 = {2,1,6};
        int[] expectedArray1 = {2,1,6,5};
        assertArrayEquals(expectedArray1, LastTwoElement.solution(array1));

        int[] array2 = {5,2,1,7,5};
        int[] expectedArray2 = {5,2,1,7,5,10};
        assertArrayEquals(expectedArray2, LastTwoElement.solution(array2));
    }
}
