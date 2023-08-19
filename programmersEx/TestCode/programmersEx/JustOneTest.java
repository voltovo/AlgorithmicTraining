package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class JustOneTest {
    private String input;
    private String expected;

    public JustOneTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { "abcabcadc", "d" },
            { "abdc", "abcd" },
            { "hello", "eho" }
        });
    }
    @Test
    public void solution() {
        assertEquals(expected, JustOne.solution(input));
    }
}
