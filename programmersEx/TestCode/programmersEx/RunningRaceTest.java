package programmersEx;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RunningRaceTest {
    private String[] input1;
    private String[] input2;
    private String[] expexted;

    public RunningRaceTest(String[] input1, String[] input2, String[] expexted) {
        this.input1 = input1;
        this.input2 = input2;
        this.expexted = expexted;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {new String[]{"mumu", "soe", "poe", "kai", "mine"},
                new String[]{"kai", "kai", "mine", "mine"},
                new String[]{"mumu", "kai", "mine", "soe", "poe"}},
            {new String[]{"mumu", "soe", "kai", "poe", "mine"},
                new String[]{"mine", "soe", "kai", "kai"},
                new String[]{"kai", "soe", "mumu", "mine", "poe"}}
        });
    }

    @Test
    public void solution() {
        Assert.assertArrayEquals(expexted, RunningRace.solution(input1, input2));
    }
}
