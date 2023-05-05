package codewars.seven;

/*
https://www.codewars.com/kata/546e2562b03326a88e000020/train/java
 */

public class DigitDigit {
    public int squareDigits(int n) {
        if (n == 0)
            return 0;

        StringBuilder stringBuilder = new StringBuilder();
        while (n != 0) {
            stringBuilder.insert(0, (int) Math.pow(n % 10, 2));
            n = n / 10;
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
