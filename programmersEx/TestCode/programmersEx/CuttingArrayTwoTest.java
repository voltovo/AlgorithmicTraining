package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CuttingArrayTwoTest {
    private String inputString;
    private int inputNumber;
    private String[] expected;

    public CuttingArrayTwoTest(String inputString, int inputNumber, String[] expected) {
        this.inputString = inputString;
        this.inputNumber = inputNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {"abc1Addfggg4556b", 6, new String[]{"abc1Ad", "dfggg4", "556b"}},
            {"abcdef123", 3, new String[]{"abc", "def", "123"}}
        });
    }
    @Test
    public void solution() {
        assertEquals(expected, CuttingArrayTwo.solution(inputString, inputNumber));
    }
}
