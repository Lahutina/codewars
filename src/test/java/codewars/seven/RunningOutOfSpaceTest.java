package codewars.seven;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class RunningOutOfSpaceTest {

    @Test
    @Order(1)
    @DisplayName("Strings with lower letters only")
    public void test1() {
        String[] input = new String[]{"kevin", "has", "no", "space"};
        String[] expected = new String[]{"kevin", "kevinhas", "kevinhasno", "kevinhasnospace"};
        Assertions.assertArrayEquals(expected, RunningOutOfSpace.spacey(input));
    }

    @Test
    @Order(2)
    @DisplayName("Strings with camel case")
    public void test2() {
        String[] input = new String[]{"Camel", "Case", "Should", "Remain"};
        String[] expected = new String[]{"Camel", "CamelCase", "CamelCaseShould", "CamelCaseShouldRemain"};
        Assertions.assertArrayEquals(expected, RunningOutOfSpace.spacey(input));
    }

    @Test
    @Order(3)
    @DisplayName("Strings with letters, digits,")
    public void test3() {
        String[] input = new String[]{"Trying!", "Adding2", "Diff3rent", "Comb1nati0ns"};
        String[] expected = new String[]{"Trying!", "Trying!Adding2", "Trying!Adding2Diff3rent", "Trying!Adding2Diff3rentComb1nati0ns"};
        Assertions.assertArrayEquals(expected, RunningOutOfSpace.spacey(input));
    }


}
