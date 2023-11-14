package info.mahfuz.utils;

import static org.junit.Assert.*;

public class RandomTest {

    @org.junit.Test
    public void generate() {
        assertThrows(IllegalArgumentException.class, () -> Random.generate(-1));
        assertThrows(IllegalArgumentException.class, () -> Random.generate(0));
        assertTrue(Random.generate(100) <= 100);
        assertTrue(Random.generate(1) <= 1);
        assertTrue(Random.generate(10) <= 10);
        assertTrue(Random.generate(15) <= 15);
    }
}