package programmersEx;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SuccessiveNumberTest {

    private int num;
    private int total;
    private int[] expected;

    public SuccessiveNumberTest(int num, int total, int[] expected) {
        this.num = num;
        this.total = total;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {3, 12, new int[]{3, 4, 5}},
            {5, 15, new int[]{1, 2, 3, 4, 5}},
            {4, 14, new int[]{2, 3, 4, 5}},
            {5, 5, new int[]{-1, 0, 1, 2, 3}},
            {3, 0, new int[]{-1, 0, 1}},
        });
    }

    @Test
    public void solution() {
        assertArrayEquals(expected, SuccessiveNumber.solution(num, total));
    }
}
