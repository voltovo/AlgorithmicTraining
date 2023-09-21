package programmersEx;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculationRankTest {
    private int[][] score;
    private int[] expected;

    public CalculationRankTest(int[][] score, int[] expected) {
        this.score = score;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new int[][] { { 80, 70 }, { 90, 50 }, { 40, 70 }, { 50, 80 } }, new int[] { 1, 2, 4, 3 } },
                { new int[][] { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 },
                        { 10, 30 } }, new int[] { 4, 4, 6, 2, 2, 1, 7 } }
        });
    }

    @Test
    public void solution() {
        assertArrayEquals(expected, CalculationRank.solution(score));
    }
}
