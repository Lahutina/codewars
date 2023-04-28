package codewars.seven;

import java.util.Arrays;

/*
https://www.codewars.com/kata/5a512f6a80eba857280000fc/train/java
 */
public class NthSmallestElement {

    public static int nthSmallest(final int[] arr, final int n) {
        return Arrays.stream(arr).sorted().toArray()[n-1];
    }
}
