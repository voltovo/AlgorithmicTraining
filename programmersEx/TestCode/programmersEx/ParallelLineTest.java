package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParallelLineTest {
    private int[][] input;
    private int expected;

    public ParallelLineTest(int[][] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {new int[][]{{1,4},{9,2},{3,8},{11,6}},1},
            {new int[][]{{1,2},{5,1},{3,6},{6,3}},1},
            {new int[][]{{3,5},{4,1},{2,4},{5,10}},0}
        });
    }

    @Test
    public void solution() {
        assertEquals(expected, ParallelLine.solution(input));
    }
}
