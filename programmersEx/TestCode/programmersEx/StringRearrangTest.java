package programmersEx;

import static org.junit.Assert.*;

import junit.framework.TestCase;
import org.junit.Test;

public class StringRearrangTest {

    @Test
    public void solution() {
        String str1 = "aaaaa";
        String str2 = "bbbbb";

        assertEquals("ababababab", StringRearrang.solution(str1, str2));
    }
}
