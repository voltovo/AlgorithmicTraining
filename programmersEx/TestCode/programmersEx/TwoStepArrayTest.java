package programmersEx;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoStepArrayTest {

    @Test
    public void solution() {
        int[] array1 = {1,2,3,4,5,6,7,8};
        int n1 = 2;
        int[][] expectedArray1 = {{1,2},{3,4},{5,6},{7,8}};
        assertEquals(expectedArray1, TwoStepArray.solution(array1, n1));

        int[] array2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n2 = 3;
        int [][] expectedArray2 = {{100, 95, 2}, {4, 5, 6}, {18, 33, 948}};
        assertEquals(expectedArray2, TwoStepArray.solution(array2, n2));
    }
}
