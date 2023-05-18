package codewars.seven;

/*
https://www.codewars.com/kata/57f759bb664021a30300007d/train/java
 */

public class Switcheroo {
    public static String switcheroo(String x) {
        char[] xSymbols = x.toCharArray();
        for (int i = 0; i < xSymbols.length; i++) {
            if (xSymbols[i] == 'a')
                xSymbols[i] = 'b';
            else if (xSymbols[i] == 'b')
                xSymbols[i] = 'a';
        }
        return new String(xSymbols);
    }
}
