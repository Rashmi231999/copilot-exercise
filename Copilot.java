/**
 * Determines whether the given number is a prime number.
 * 
 * @param n the integer to check for primality
 * @return true if n is a prime number, false otherwise
 */
public boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}