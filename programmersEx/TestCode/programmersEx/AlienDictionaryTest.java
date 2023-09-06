package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AlienDictionaryTest {
    private String[] input1;
    private String[] input2;
    private int expected;

    public AlienDictionaryTest(String[] input1, String[] input2, int expected) {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}, 2},
            {new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}, 1},
            {new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}, 2}
        });
    }

    @Test
    public void solution() {
        assertEquals(expected, AlienDictionary.solution(input1, input2));
    }
}
