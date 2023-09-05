package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SafeZoneTest {
    private int[][] input;
    private int expected;

    public SafeZoneTest(int[][] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {new int[][]{{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,1,0,0},{0,0,0,0,0}}, 16},
//            {new int[][]{{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,1,1,0},{0,0,0,0,0}}, 13},
            {new int[][]{{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1}}, 0}
        });
    }

    @Test
    public void solution() {
        assertEquals(expected, SafeZone.solution(input));
    }
}
