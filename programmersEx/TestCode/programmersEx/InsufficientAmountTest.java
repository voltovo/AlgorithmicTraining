package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class InsufficientAmountTest {
    private int price;
    private int money;
    private int count;
    private long expected;

    public InsufficientAmountTest(int price, int money, int count, long expected) {
        this.price = price;
        this.money = money;
        this.count = count;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {3, 20, 4, 10}
        });
    }

    @Test
    public void solution() {
        assertEquals(expected, InsufficientAmount.solution(price, money, count));
    }
}
