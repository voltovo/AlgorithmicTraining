package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ControlZTest {
    private String input;
    private int expected;

    public ControlZTest(String input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { "1 2 Z 3", 4 },
            { "10 20 30 40", 100 },
            { "10 Z 20 Z 1", 1 },
            { "-1 -2 -3 Z", -3 },
            { "10 Z 20 Z", 0 }
        });
    }

    @Test
    public void testSolution() {
        assertEquals(expected, ControlZ.solution(input));
    }
}
