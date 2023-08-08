package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NearestNumberTest {
    private int[] numbers;
    private int target;
    private int expected;

    public NearestNumberTest(int[] numbers, int target, int expected) {
        this.numbers = numbers;
        this.target = target;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {new int[]{3, 10, 28}, 20, 28},
            {new int[]{10, 11, 12}, 13, 12},
            {new int[]{2, 4, 7}, 3, 2}
        });
    }
    @Test
    public void solution() {
        assertEquals(expected, NearestNumber.solution(numbers, target));
    }
}
