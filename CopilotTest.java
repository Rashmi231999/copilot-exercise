import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Copilot class.
 * Tests the isPrime() method with various input cases including edge cases and prime/composite numbers.
 */
public class CopilotTest {
    private Copilot copilot = new Copilot();

    /**
     * Tests that negative numbers are correctly identified as non-prime.
     * Expected: isPrime(-5) returns false
     */
    @Test
    public void testNegativeNumber() {
        assertFalse(copilot.isPrime(-5));
    }

    /**
     * Tests that zero is correctly identified as non-prime.
     * Expected: isPrime(0) returns false
     */
    @Test
    public void testZero() {
        assertFalse(copilot.isPrime(0));
    }

    /**
     * Tests that one is correctly identified as non-prime.
     * Expected: isPrime(1) returns false
     */
    @Test
    public void testOne() {
        assertFalse(copilot.isPrime(1));
    }

    /**
     * Tests that two is correctly identified as prime.
     * Two is the only even prime number.
     * Expected: isPrime(2) returns true
     */
    @Test
    public void testTwo() {
        assertTrue(copilot.isPrime(2));
    }

    /**
     * Tests that odd prime numbers are correctly identified as prime.
     * Expected: isPrime(17) returns true and isPrime(29) returns true
     */
    @Test
    public void testPrimeNumber() {
        assertTrue(copilot.isPrime(17));
        assertTrue(copilot.isPrime(29));
    }

    /**
     * Tests that composite numbers (non-prime) are correctly identified.
     * Expected: isPrime(4), isPrime(15), and isPrime(100) all return false
     */
    @Test
    public void testCompositeNumber() {
        assertFalse(copilot.isPrime(4));
        assertFalse(copilot.isPrime(15));
        assertFalse(copilot.isPrime(100));
    }

    /**
     * Tests that larger prime numbers are correctly identified as prime.
     * Expected: isPrime(97) returns true
     */
    @Test
    public void testLargePrime() {
        assertTrue(copilot.isPrime(97));
    }
}