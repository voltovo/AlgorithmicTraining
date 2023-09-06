package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculateTriangleLengthTest {
    private int[] input;
    private int expected;

    public CalculateTriangleLengthTest(int[] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        return Arrays.asList(new Object[][]{
            {new int[]{1,2}, 1},
            {new int[]{3,6}, 5},
            {new int[]{11,7}, 13}
        });
    }

    @Test
    public void solution() {
        assertEquals(expected, CalculateTriangleLength.solution(input));
    }
}
