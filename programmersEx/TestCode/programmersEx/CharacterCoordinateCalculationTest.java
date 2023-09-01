package programmersEx;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CharacterCoordinateCalculationTest {
    private String[] keyinput;
    private int[] board;
    private int[] expected;

    public CharacterCoordinateCalculationTest(String[] keyinput, int[] board, int[] expected) {
        this.keyinput = keyinput;
        this.board = board;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11}, new int[]{2, 1}},
            {new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9}, new int[]{0, -4}},
            {new String[]{"up", "up", "up", "up", "up"}, new int[]{7, 9}, new int[]{0, 4}},
            {new String[]{"right", "right", "right", "right", "right", "left"}, new int[]{9, 5}, new int[]{3, 0}}
        });
    }

    @Test
    public void solution() {
        assertArrayEquals(expected, CharacterCoordinateCalculation.solution(keyinput, board));
    }
}
