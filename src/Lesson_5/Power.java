package Lesson_5;

/**
 * Algorithms and data structures. Lesson 5.
 *
 * @author Olga Petrova
 * @version dated Oct 24, 2018
 */

public class Power {

    public static void main(String[] args) {
        System.out.println("2 to the power of 0 = " + power(2, 0));
        System.out.println("0 to the power of 3 = " + power(0, 3));
        System.out.println("2 to the power of 5 = " + power(2, 5));
        System.out.println("2 to the power of -3 = " + power(2, -3));
        System.out.println("0 to the power of 0 = " + power(0, 0));
    }

    private static float power(int n, int exp) {
        if (n == 0 && exp == 0) {
            System.out.println("undetermined");
            return -1;
        }
        if (n == 1)
            return n;
        if (n == 0)
            return 0;
        if (exp > 0)
            return n * power(n, exp - 1);
        else if (exp < 0)
            return 1 / (n * power(n, - exp - 1));
        else
            return 1;
    }
}
