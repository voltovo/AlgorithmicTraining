package programmersEx;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UnusualAlignmentTest {
    private int[] numlist;
    private int num;
    private int[] expected;

    public UnusualAlignmentTest(int[] numlist, int num, int[] expected) {
        this.numlist = numlist;
        this.num = num;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new int[] { 1, 2, 3, 4, 5, 6 }, 4, new int[] { 4, 5, 3, 6, 2, 1 } },
                { new int[] { 10000, 20, 36, 47, 40, 6, 10, 7000 }, 30,
                        new int[] { 36, 40, 20, 47, 10, 6, 7000, 10000 } }
        });
    }

    @Test
    public void testSolution() {
        assertArrayEquals(expected, UnusualAlignment.solution(numlist, num));
    }
}
