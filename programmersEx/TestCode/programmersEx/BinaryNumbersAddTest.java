package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BinaryNumbersAddTest {
    private String bin1;
    private String bin2;
    private String expexted;

    public BinaryNumbersAddTest(String bin1, String bin2, String expexted) {
        this.bin1 = bin1;
        this.bin2 = bin2;
        this.expexted = expexted;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "10", "11", "101" },
                { "1001", "1111", "11000" },
                { "100001", "1010101", "1110110" }
        });
    }

    @Test
    public void testSolution() {
        assertEquals(expexted, BinaryNumbersAdd.solution(bin1, bin2));
    }
}
