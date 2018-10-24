package Lesson_5;

import java.io.File;

/**
 * Algorithms and data structures. Lesson 5.
 *
 * @author Olga Petrova
 * @version dated Oct 24, 2018
 */

public class Lesson5 {

    public static void main(String[] args) throws InterruptedException {

        int n = 5;

        //countdown(n);

        // while (true) {
        //    System.out.println(n--);
        // }

        //System.out.println(factorial(n));

        File rootDir = new File("D:\\petrova_oa\\Desktop\\GB\\Алгоритмы\\Lesson_5");
        viewDir(rootDir, "");
    }

    private static void viewDir(File rootDir, String prefix) {
        if (rootDir.isFile()) {
            System.out.println("File: " + prefix + rootDir.getName());
        } else {
            System.out.println("Dir: " + prefix + rootDir.getName());
            for (File file : rootDir.listFiles()) {
                viewDir(file, prefix + "   ");
            }
        }
    }

    private static int factorial(int n) {
        if (n <= 0)
            return 1;
        return n * factorial(n - 1);
    }

    private static int countdown(int n) throws InterruptedException {

        if (n < 0) {
            return n;
        }
        System.out.println(n);
        Thread.sleep(1000);
        return countdown(n - 1);
    }
}
