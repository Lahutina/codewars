package codewars.five;

import java.util.Map;
import java.util.stream.Collectors;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> str1Map = str1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(c -> c, c -> 1, Integer::sum));

        for (char c : str2.toCharArray()) {
            if (str1Map.get(c) == null)
                return false;

            str1Map.put(c, str1Map.get(c) - 1);

            if (str1Map.get(c) < 0) {
                return false;
            }
        }
        return true;
    }
}
