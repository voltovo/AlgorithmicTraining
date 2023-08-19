package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ComputeStringTest {
    private String input;
    private int expected;

    public ComputeStringTest(String input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {"3 + 4", 7},
            {"3 + 4 + 5", 12},
            {"9 - 5 + 1", 5}
        });
    }
    @Test
    public void solution() {
        assertEquals(expected, ComputeString.solution(input));
    }
}
