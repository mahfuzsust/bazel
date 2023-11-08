package info.mahfuz.services;

import static org.junit.Assert.*;

public class PrimeTest {

    @org.junit.Test
    public void generate() {
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(0));
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(5));
        assertFalse(Prime.isPrime(4));
    }
}