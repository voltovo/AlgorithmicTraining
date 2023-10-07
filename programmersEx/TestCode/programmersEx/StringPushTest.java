package programmersEx;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StringPushTest {

    private String A;
    private String B;
    private int expected;

    public StringPushTest(String a, String b, int expected) {
        A = a;
        B = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"hello", "ohell", 1},
            {"apple", "elppa", -1},
            {"atat", "tata", 1},
            {"abc", "abc", 0}
        });
    }

    @Test
    public void solution() {
        assertEquals(expected, StringPush.solution(A, B));
    }
}
