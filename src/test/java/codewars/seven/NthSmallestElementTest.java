package codewars.seven;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthSmallestElementTest {
    @Test
    public void checkPositiveValues() {
        doTest(new int[]{3, 1, 2}, 2, 2);
        doTest(new int[]{15, 20, 7, 10, 4, 3}, 3, 7);
    }

    @Test
    public void checkNegativeValues() {
        doTest(new int[]{-5, -1, -6, -18}, 4, -1);
        doTest(new int[]{-102, -16, -1, -2, -367, -9}, 5, -2);
    }

    @Test
    public void checkMixedValues() {
        doTest(new int[]{2, 169, 13, -5, 0, -1}, 4, 2);
        doTest(new int[]{177, 225, 243, -169, -12, -5, 2, 92}, 5, 92);
    }

    @Test
    public void testRandomNumbers() {
        for (int trial = 1; trial <= 100; trial++) {
            int count = randomInteger(3, 202); // count range [3, 202]
            int n = randomInteger(3, 15);
            int[] arr1 = new int[count];
            if (n > count) n = count;
            for (int i = 0; i < count; i++)
                arr1[i] = randomInteger(-100, 100); // Element value range: [-100, 100)
            int[] arr2 = Arrays.copyOf(arr1, count);
            Arrays.sort(arr2);
            doTest(arr1, n, arr2[n - 1]);
        }
    }

    private int randomInteger(final int min, final int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    private void doTest(final int[] arr, final int n, final int expected) {
        assertEquals(expected, NthSmallestElement.nthSmallest(arr, n));
    }
}