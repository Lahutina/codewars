package codewars.six;

/*
https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
 */

public class FindTheParityOutlier {
    static int find(int[] integers) {
        boolean isAllEven = ((integers[0] % 2 == 0) && (integers[1] % 2 == 0))
                || ((integers[0] % 2 == 0) && (integers[2] % 2 == 0))
                || ((integers[1] % 2 == 0) && (integers[2] % 2 == 0));

        int result = 0;
        for (int integer : integers) {
            if (isAllEven && integer % 2 != 0)
                result = integer;
            else if (!isAllEven && integer % 2 == 0) {
                result = integer;
            }
        }
        return result;
    }
}
