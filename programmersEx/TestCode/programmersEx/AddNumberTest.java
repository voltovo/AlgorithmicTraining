package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AddNumberTest {
    private String input;
    private int expected;

    public AddNumberTest(String input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        return Arrays.asList(new Object[][]{
            {"aAb1B2cC34oOp", 37},
            {"1a2b3c4d123Z", 133},
            {"1a4b3c4d123", 135}
        });
    }

    @Test
    public void solution() {
        assertEquals(expected, AddNumber.solution(input));
    }
}
