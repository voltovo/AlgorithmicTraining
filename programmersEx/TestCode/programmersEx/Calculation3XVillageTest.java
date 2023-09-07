package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Calculation3XVillageTest {
    private int input;
    private int expected;

    public Calculation3XVillageTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        return Arrays.asList(new Object[][]{
            {15, 25},
            {10, 16},
            {40, 76}
        });
    }

    @Test
    public void solution() {
        assertEquals(expected, Calculation3XVillage.solution(input));
    }
}
