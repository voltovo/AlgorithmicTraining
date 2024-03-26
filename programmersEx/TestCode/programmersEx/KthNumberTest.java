package programmersEx;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class KthNumberTest {
    private int[] input1;
    private int[][] input2;
    private int[] expexted;

    public KthNumberTest(int[] input1, int[][] input2, int[] expexted) {
        this.input1 = input1;
        this.input2 = input2;
        this.expexted = expexted;
    }

    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        return Arrays.asList(new Object[][]{
            {new int[]{1,5,2,6,3,7,4},
            new int[][]{{2,5,3}, {4,4,1}, {1,7,3}},
            new int[]{5,6,3}}
        });
    }

    @Test
    public void solution() {
        Assert.assertArrayEquals(expexted, KthNumber.solution(input1, input2));
    }
}
