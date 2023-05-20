package codewars.six;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
https://www.codewars.com/kata/52efefcbcdf57161d4000091/train/java
 */
public class CountCharacters {
    public static Map<Character, Integer> count(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));
    }
}
