package programmersEx;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class RemoveDuplicateCharTest {

    @Test
    public void solution() {
        String my_string1 = "people";
        String expectedAnswer1 = "peol";
        assertEquals(expectedAnswer1, RemoveDuplicateChar.solution(my_string1));

        String my_string2 = "We are the world";
        String expectedAnswer2 = "We arthwold";
        assertEquals(expectedAnswer2, RemoveDuplicateChar.solution(my_string2));
    }
}
