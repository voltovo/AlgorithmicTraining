package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RectangularCalculationTest {
    private int[][] input;
    private int expected;
    public RectangularCalculationTest(int[][] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dat(){
        return Arrays.asList(new Object[][]{
            {new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}, 1},
            {new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}, 4}
        });
    }
    @Test
    public void solution() {
        assertEquals(expected, RectangularCalculation.solution(input));
    }
}
