package programmersEx;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProcessingCodeTest {

    @Test
    public void SoluÎtion() {
        String code = "1";
        String expectedAnswer = "EMPTY";
        assertEquals(expectedAnswer, ProcessingCode.solution(code));
    }
}
