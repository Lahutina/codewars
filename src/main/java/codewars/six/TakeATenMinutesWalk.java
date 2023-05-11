package codewars.six;

/*
https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java
 */
public class TakeATenMinutesWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;

        int x = 0, y = 0;

        for (char way : walk) {
            y += way == 'n' ? 1 : way == 's' ? -1 : 0;
            x += way == 'e' ? 1 : way == 'w' ? -1 : 0;
        }

        return x == 0 && y == 0;
    }
}
