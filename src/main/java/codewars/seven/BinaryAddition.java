package codewars.seven;

/*
https://www.codewars.com/kata/551f37452ff852b7bd000139/train/java
*/

public class BinaryAddition {
    public static String binaryAddition(int a, int b) {
        StringBuilder binaryNumber = new StringBuilder();
        int sum = a + b;

        while (sum > 0) {
            binaryNumber.append(sum % 2);
            sum /= 2;
        }

        return binaryNumber.reverse().toString();
    }
}
