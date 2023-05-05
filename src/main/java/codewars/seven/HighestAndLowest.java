package codewars.seven;

import java.util.Arrays;

/*
https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
*/

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        int[] numbersInt = Arrays.stream(numbers.split(" "))
                                 .mapToInt(Integer::parseInt)
                                 .sorted().toArray();
        return numbersInt[numbersInt.length - 1] + " " + numbersInt[0];
    }
}
