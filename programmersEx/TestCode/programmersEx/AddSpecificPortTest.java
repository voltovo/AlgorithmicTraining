package programmersEx;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddSpecificPortTest {

    @Test
    public void solution() {
        int a = 3;
        int b = 4;
        boolean[] included = {true, false, false, true, true};
        int expected = 37;
        assertEquals(expected, AddSpecificPort.solution(a, b, included));
    }
}
