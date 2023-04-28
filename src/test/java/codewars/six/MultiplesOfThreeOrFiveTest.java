package codewars.six;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiplesOfThreeOrFiveTest {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOfThreeOrFive().solution(10));
    }
}
