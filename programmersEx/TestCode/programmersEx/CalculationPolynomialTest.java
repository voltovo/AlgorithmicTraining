package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculationPolynomialTest {
    private String input;
    private String expected;

    public CalculationPolynomialTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        return Arrays.asList(new Object[][]{
            {"3x + 7 + x", "4x + 7"},
            {"x + x + x", "3x"},
            {"2x", "2x"},
            {"7 + 7", "14"},
            {"x + 1", "x + 1"}
        });
    }
    @Test
    public void solution() {
        assertEquals(expected, CalculationPolynomial.solution(input));
    }
}
