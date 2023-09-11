package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LengthOverlappingTest {

    private int[][] lines;
    private int expected;

    public LengthOverlappingTest(int[][] lines, int expected) {
        this.lines = lines;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {new int[][]{{0, 2}, {-3, -1}, {-2, 1}}, 2},
            {new int[][]{{-1, 1}, {1, 3}, {3, 9}}, 0},
            {new int[][]{{0,8}, {0,2}, {6,8}}, 4},
            {new int[][]{{1, 12}, {3, 6}, {2, 4}}, 4},
            {new int[][]{{0, 5}, {3, 9}, {1, 10}}, 8}
        });
    }

    @Test
    public void solution() {
        assertEquals(expected, LengthOverlapping.solution(lines));
    }
}
