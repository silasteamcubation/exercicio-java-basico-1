package br.com.mercadolivre;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTest {

    @Test
    public void testNumbers() {
        PrimeChecker primeChecker = new PrimeChecker();

        assertTrue(primeChecker.isPrime(1));
        assertTrue(primeChecker.isPrime(2));
        assertTrue(primeChecker.isPrime(3));
        assertTrue(primeChecker.isPrime(5));
        assertTrue(primeChecker.isPrime(7));
        assertTrue(primeChecker.isPrime(11));
        assertTrue(primeChecker.isPrime(13));
        assertTrue(primeChecker.isPrime(17));

        assertFalse(primeChecker.isPrime(4));
        assertFalse(primeChecker.isPrime(8));
        assertFalse(primeChecker.isPrime(9));
        assertFalse(primeChecker.isPrime(10));
        assertFalse(primeChecker.isPrime(12));
        assertFalse(primeChecker.isPrime(15));
    }
}
