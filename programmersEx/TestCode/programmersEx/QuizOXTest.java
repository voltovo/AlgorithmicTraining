package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class QuizOXTest {
    private String[] input;
    private String[] expected;

    public QuizOXTest(String[] input, String[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {new String[]{"3 - 4 = -3", "5 + 6 = 11"}, new String[]{"X", "O"}},
            {new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"}, new String[]{"O", "O", "X", "O"}}
        });
    }
    @Test
    public void solution() {
        assertEquals(expected, QuizOX.solution(input));
    }
}
