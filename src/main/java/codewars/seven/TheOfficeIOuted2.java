package codewars.seven;

/*
https://www.codewars.com/kata/57ecf6efc7fe13eb070000e1/train/java
*/

public class TheOfficeIOuted2 {
    public static String outed(Person[] meet, String boss) {
        double totalScore = 0.0;
        int i = 0;

        for( ; i < meet.length; i++)
            totalScore +=  meet[i].name.equals(boss) ? 2 * meet[i].happiness : meet[i].happiness;

        return totalScore/i <= 5.0 ? "Get Out Now!" : "Nice Work Champ!";
    }
}