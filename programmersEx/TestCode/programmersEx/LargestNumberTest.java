package programmersEx;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LargestNumberTest {
    private int[] input;
    private String expected;

    public LargestNumberTest(int[] input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {new int[]{6,10,2}, "6210"},
            {new int[]{3, 30, 34, 5, 9}, "9534330"}
        });
    }

    @Test
    public void solution() {
        Assert.assertEquals(expected, LargestNumber.solution(input));
    }
}
