package info.mahfuz.services;

public class Prime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
