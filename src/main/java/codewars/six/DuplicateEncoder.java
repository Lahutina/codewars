package codewars.six;

import java.util.HashMap;
import java.util.Map;

/*
https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java
 */

public class DuplicateEncoder {
    static String encode(String word) {
        char[] inputCharacters = word.toLowerCase().toCharArray();
        Map<Character, Boolean> isCharMoreThanOne = new HashMap<>();

        for (char c : inputCharacters) {
            isCharMoreThanOne.put(c, isCharMoreThanOne.containsKey(c));
        }

        StringBuilder resultStr = new StringBuilder();
        for (char c : inputCharacters) {
            resultStr.append(isCharMoreThanOne.get(c) ? ")" : "(");
        }

        return resultStr.toString();
    }
}
