package codewars.seven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitDigitTest {
    @Test
    public void test() {
        assertEquals(811181, new DigitDigit().squareDigits(9119));
        assertEquals(0, new DigitDigit().squareDigits(0));
    }

}