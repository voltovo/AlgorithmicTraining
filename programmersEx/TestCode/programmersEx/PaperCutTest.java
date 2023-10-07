package programmersEx;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PaperCutTest {

    private int M;
    private int N;
    private int expected;

    public PaperCutTest(int m, int n, int expected) {
        M = m;
        N = n;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {2, 2, 3},
            {2, 5, 9},
            {1, 1, 0}
        });
    }

    @Test
    public void solution() {
        Assert.assertEquals(expected, PaperCut.solution(M, N));
    }
}
