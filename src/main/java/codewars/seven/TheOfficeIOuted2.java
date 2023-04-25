package codewars.seven;

/*
https://www.codewars.com/kata/57ecf6efc7fe13eb070000e1/train/java
*/

public class TheOfficeIOuted2 {
    public static String outed(Person[] meet, String boss) {
        double totalScore = 0.0;

        for (Person person : meet) {
            totalScore += person.name.equals(boss) ? 2 * person.happiness : person.happiness;
        }

        return totalScore / meet.length <= 5.0 ? "Get Out Now!" : "Nice Work Champ!";
    }
}