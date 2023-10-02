package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class KCountTest {
    private int i;
    private int j;
    private int k;
    private int expected;

    public KCountTest(int i, int j, int k, int expected) {
        this.i = i;
        this.j = j;
        this.k = k;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 13, 1, 6 },
                { 10, 50, 5, 5 },
                { 3, 10, 2, 0 }
        });
    }

    @Test
    public void testSolution() {
        assertEquals(expected, KCount.solution(i, j, k));
    }
}
