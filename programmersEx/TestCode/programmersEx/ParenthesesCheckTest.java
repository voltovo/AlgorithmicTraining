package programmersEx;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParenthesesCheckTest {
    private String s;
    private boolean expected;

    public ParenthesesCheckTest(String s, boolean expected) {
        this.s = s;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {"()()", true}, {"(())()", true}, {")()(", false}, {"(()(", false},
        });
    }

    @Test
    public void solution() {
        Assert.assertEquals(expected, ParenthesesCheck.solution(s));
    }
}
