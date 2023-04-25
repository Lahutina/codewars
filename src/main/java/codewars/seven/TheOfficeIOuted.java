package codewars.seven;

import java.util.Arrays;

/*
https://www.codewars.com/kata/57ecf6efc7fe13eb070000e1/train/java
*/

public class TheOfficeIOuted {
    public static String outed(Person[] meet, String boss) {
        return Arrays.stream(meet)
                .mapToInt(p -> !p.name.equals(boss) ? p.happiness : 2 * p.happiness)
                .average().orElse(0.0) <= 5.0 ? "Get Out Now!" : "Nice Work Champ!";
    }
}