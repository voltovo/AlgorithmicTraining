package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class HateEnglishTest {
    private String input;
    private long expected;

    public HateEnglishTest(String input, long expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { "onetwothreefourfivesixseveneightnine", 123456789 },
            { "onefourzerosixseven", 14067 }
        });
    }
    @Test
    public void solution() {
        assertEquals(expected, HateEnglish.solution(input));
    }
}
