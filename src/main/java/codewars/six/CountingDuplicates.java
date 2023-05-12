package codewars.six;

import java.util.HashMap;
import java.util.Map;

/*
https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
 */
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        char[] inputCharacters = text.toLowerCase().toCharArray();
        Map<Character, Boolean> isCharMoreThanOne = new HashMap<>();

        for (char c : inputCharacters) {
            isCharMoreThanOne.put(c, isCharMoreThanOne.containsKey(c));
        }
        return isCharMoreThanOne.values().stream().mapToInt(v -> v ? 1 : 0).sum();
    }
}
