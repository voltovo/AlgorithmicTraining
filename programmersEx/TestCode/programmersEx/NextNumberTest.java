package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NextNumberTest {
    private int[] common;
    private int expected;

    public NextNumberTest(int[] common, int expected) {
        this.common = common;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        return Arrays.asList(new Object[][]{
            {new int []{1,2,3,4}, 5},
            {new int []{2,4,8}, 16},
        });
    }

    @Test
    public void solution() {
        assertEquals(expected, NextNumber.solution(common));
    }
}
