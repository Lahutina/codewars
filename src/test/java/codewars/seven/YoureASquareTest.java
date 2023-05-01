package codewars.seven;

import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.assertEquals;

public class YoureASquareTest {
    private static boolean isSquare(int n) {
        return n >= 0 && Math.pow(Math.round(Math.sqrt(n)), 2) == n;
    }

    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, YoureASquare.isSquare(-1));
        assertEquals("0 is a square number (0 * 0)", true, YoureASquare.isSquare(0));
        assertEquals("3 isn't a square number", false, YoureASquare.isSquare(3));
        assertEquals("4 is a square number (2 * 2)", true, YoureASquare.isSquare(4));
        assertEquals("25 is a square number (5 * 5)", true, YoureASquare.isSquare(25));
        assertEquals("26 isn't a square number", false, YoureASquare.isSquare(26));
    }

    @Test
    public void shouldWorkForRandomSquareNumbers() throws Exception {
        Random rand = new Random();
        for (int i = 0; i < 100; ++i) {
            int randomNum = rand.nextInt(0x0fff);
            int randomSq = randomNum * randomNum;
            assertEquals(String.format("%d is a square number (%d * %d)", randomSq, randomSq, randomSq), true, YoureASquare.isSquare(randomSq));
        }
    }

    @Test
    public void shouldWorkForRandomNumbers() throws Exception {
        Random rand = new Random();
        for (int i = 0; i < 100; ++i) {
            int randomNum = rand.nextInt(0x0fffffff);
            assertEquals(String.format("Didn't work on %d", randomNum), isSquare(randomNum), YoureASquare.isSquare(randomNum));
        }
    }
}
