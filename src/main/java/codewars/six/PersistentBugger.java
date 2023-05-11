package codewars.six;

/*
https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
*/
public class PersistentBugger {
    public static int persistence(long n) {
        int count = 0;
        while (n >= 10) {
            n = Long.toString(n).chars().mapToLong(Character::getNumericValue).reduce((a, b) -> a * b).orElse(1);
            count++;
        }
        return count;
    }
}
