package programmersEx;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ChickenCouponTest {
    private int chichken;
    private int expected;

    public ChickenCouponTest(int chichken, int expected) {
        this.chichken = chichken;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 100, 11 },
                { 1081, 120 },
                { 0, 0 }
        });
    }

    @Test
    public void testSolution() {
        assertEquals(expected, ChickenCoupon.solution(chichken));
    }
}
