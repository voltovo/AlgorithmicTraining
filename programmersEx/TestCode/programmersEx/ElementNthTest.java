package programmersEx;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ElementNthTest {
    private int[] inputArray;
    private int inputInt;
    private int[] expectedArray;

    public ElementNthTest(int[] inputArray, int inputInt, int[] expectedArray) {
        this.inputArray = inputArray;
        this.inputInt = inputInt;
        this.expectedArray = expectedArray;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {new int[]{2, 1, 6}, 3, new int[]{6}},
            {new int[]{5, 2, 1, 7, 5}, 2, new int[]{2, 1, 7, 5}}
        });
    }

    @Test
    public void solution() {
        assertArrayEquals(expectedArray, ElementNth.solution(inputArray, inputInt));
    }
}
