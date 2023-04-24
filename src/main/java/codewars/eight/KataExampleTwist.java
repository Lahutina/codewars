package codewars.eight;

// import java.util.stream.*;

/*
https://www.codewars.com/kata/525c1a07bb6dda6944000031/train/java
*/

public class KataExampleTwist {
    public static String[] kataExampleTwist()
    {
        String[] websites = new String[1000];

        for(int i = 0; i < 1000; i++)
            websites[i] = "codewars";

        return websites;

//         return Stream.generate(() -> "codewars").limit(1000).toArray(String[]::new);
    }
}
