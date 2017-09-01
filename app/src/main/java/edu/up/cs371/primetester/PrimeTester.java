package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        // for now, return a random result
        int counter = 2;
        boolean check = true;
        while(check && counter < n/2) {
            if(n%counter == 0) {
                check = false;
            }
            counter++;
        }
        return check;
    }
}
