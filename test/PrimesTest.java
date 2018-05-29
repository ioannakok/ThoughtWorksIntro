import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PrimesTest {

    Primes primer;

    @BeforeEach
    void init() {
        primer = new Primes();
    }

    @Test
    void oneIsNotPrime() {
        assertFalse(primer.isPrime(1));
    }

    @Test
    void twoIsPrime() {
        assertTrue(primer.isPrime(2));
    }

    @Test
    void threeIsPrime() {
        assertTrue(primer.isPrime(3));
    }

    @Test
    void fourIsNotPrime() {
        assertFalse(primer.isPrime(4));
    }

    @Test
    void primesWhenGivenOne() {
        assertTrue(primer.generate(1).isEmpty());
    }

    @Test
    void primesWhenGivenTwo() {
        List<Integer> primes = new ArrayList<Integer>() {{ add(2); }};
        assertEquals(primer.generate(2), primes);
    }

    @Test
    void primesWhenGivenThree() {
        List<Integer> primes = new ArrayList<Integer>() {{
            add(2);
            add(3);
        }};
        assertEquals(primes, primer.generate(3));

    }

    @Test
    void primesWhenGivenFive() {
        List<Integer> primes = new ArrayList<Integer>() {{
            add(2);
            add(3);
            add(5);
        }};
        assertEquals(primes, primer.generate(5));
    }

    @Test
    void primesWhenGiven20() {
        List<Integer> primes = new ArrayList<Integer>() {{
            add(2);
            add(3);
            add(5);
            add(7);
            add(11);
            add(13);
            add(17);
            add(19);
        }};
        assertEquals(primes, primer.generate(20));
    }
}
