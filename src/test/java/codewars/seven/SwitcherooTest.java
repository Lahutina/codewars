package codewars.seven;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitcherooTest {
    @Test
    public void testSomething() {
        assertEquals("abc",Switcheroo.switcheroo( "bac"));
        assertEquals("ccc",Switcheroo.switcheroo("ccc"));
        assertEquals("aaabcccbaaa",Switcheroo.switcheroo("bbbacccabbb"));
    }

}