package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BabblingTest {
    private String[] babbling;
    private int expected;

    public BabblingTest(String[] babbling, int expected) {
        this.babbling = babbling;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new String[] { "aya", "yee", "u", "maa", "wyeoo" }, 1 },
                { new String[] { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" }, 3 }
        });
    }

    @Test
    public void testSolution() {
        assertEquals(expected, Babbling.solution(babbling));
    }
}
