package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LoginSuccTest {
    private String[] id_pw;
    private String[][] db;
    private String expected;

    public LoginSuccTest(String[] id_pw, String[][] db, String expected) {
        this.id_pw = id_pw;
        this.db = db;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new String[] { "meosseugi", "1234" },
                        new String[][] { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } }, "login" },
                { new String[] { "programmer01", "15789" },
                        new String[][] { { "programmer02", "111111" }, { "programmer00", "134" },
                                { "programmer01", "1145" } },
                        "wrong pw" },
                { new String[] { "rabbit04",
                        "98761" },
                        new String[][] { { "jaja11",
                                "98761" },
                                { "krong0313",
                                        "29440" },
                                { "rabbit00",
                                        "111333" } },
                        "fail" }
        });
    }

    @Test
    public void testSolution() {
        assertEquals(expected, LoginSucc.solution(id_pw, db));
    }
}
