package codewars.six;

import java.util.HashMap;
import java.util.Map;

/*
https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
 */
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        char[] inputCharacters = text.toLowerCase().toCharArray();
        Map<Character, Integer> isCharMoreThanOne = new HashMap<>();

        for (char c : inputCharacters) {
            isCharMoreThanOne.put(c, isCharMoreThanOne.containsKey(c) ? 1 : 0);
        }
        return isCharMoreThanOne.values().stream().mapToInt(Integer::intValue).sum();
    }
}
