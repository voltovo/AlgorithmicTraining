package programmersEx;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MinimumRectangleTest {
    private int[][] input;
    private int expexted;

    public MinimumRectangleTest(int[][] input, int expexted) {
        this.input = input;
        this.expexted = expexted;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {new int[][]{{60, 50},{30, 70},{60, 30}, {80, 40}}, 4000},
            {new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}, 120},
            {new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}, 133}
        });
    }

    @Test
    public void solution() {
        Assert.assertEquals(expexted, MinimumRectangle.solution(input));
    }
}
