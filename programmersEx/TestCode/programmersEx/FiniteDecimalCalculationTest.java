package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FiniteDecimalCalculationTest {
    private int  numerator;
    private int denominator;
    private int expected;

    public FiniteDecimalCalculationTest(int numerator, int denominator, int expected) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        return Arrays.asList(new Object[][]{
            {7, 20, 1},
            {11, 22, 1},
            {12, 21, 2}
        });
    }

    @Test
    public void solution() {
        assertEquals(expected, FiniteDecimalCalculation.solution(numerator, denominator));
    }
}
