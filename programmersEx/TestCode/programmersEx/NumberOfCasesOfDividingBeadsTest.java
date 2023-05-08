package programmersEx;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class NumberOfCasesOfDividingBeadsTest {

    @Test
    public void solution() {
        // 최소값 1을 넣으면 어떻게 되는지 테스트 코드 짜줘
        int balls1 = 1;
        int share1 = 1;
        long expectedAnswer1 = 1;
        assertEquals(expectedAnswer1, NumberOfCasesOfDividingBeads.solution(balls1, share1));
    }
}
