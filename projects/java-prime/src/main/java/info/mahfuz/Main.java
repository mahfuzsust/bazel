package info.mahfuz;

import info.mahfuz.services.Prime;
import info.mahfuz.utils.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Checking is prime 5: " + Prime.isPrime(5));
        int n = Random.generate(1, 100);
        System.out.println("Checking is prime " + n + ": " + Prime.isPrime(n));
    }
}