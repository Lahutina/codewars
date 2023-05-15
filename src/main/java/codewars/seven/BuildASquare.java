package codewars.seven;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
https://www.codewars.com/kata/59a96d71dbe3b06c0200009c/train/java
 */

public class BuildASquare {
    public static final String generateShape(int n) {
        return IntStream.range(0, n)
                .mapToObj(i -> "+".repeat(n))
                .collect(Collectors.joining("\n"));
    }
}

