package codewars.six;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
*/
public class StopgninnipSMysdroW {

    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(s -> s.length() >= 5 ? new StringBuilder(s).reverse().toString() : s)
                .collect(Collectors.joining(" "));
    }

}
