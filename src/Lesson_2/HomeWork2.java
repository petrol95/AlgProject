package Lesson_2;

import Lesson_2.MyArr;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Algorithms and data structures. Lesson 2.
 *
 * @author Olga Petrova
 * @version dated Oct 14, 2018
 */

public class HomeWork2 {

    final static int SIZE = 100000;

    public static void main(String[] args) {

        MyArr arr = new MyArr(SIZE);
        MyArr arr1 = new MyArr(SIZE);
        MyArr arr2 = new MyArr(SIZE);

        for (int i = 0; i < SIZE; i++) {
            Random rand = new Random();
            arr.setArr(i, rand.nextInt(100));
        }

        // Creation instances
        arr.copyArray(arr1);
        arr.copyArray(arr2);
        // System.out.println(arr);
        // System.out.println(arr1);
        // System.out.println(arr2);


        // Bubble sort
        System.out.println("Bubble sort");
        long start = System.nanoTime();
        arr.sortBubble();
        System.out.println("finished in " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start) + " ms");
        // System.out.println(arr);

        // Selection sort
        System.out.println("Selection sort");
        start = System.nanoTime();
        arr1.sortSelect();
        System.out.println("finished in " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start) + " ms");
        // System.out.println(arr1);

        // Insertion sort
        System.out.println("Insertion sort");
        start = System.nanoTime();
        arr2.sortSelect();
        System.out.println("finished in " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start) + " ms");
        // System.out.println(arr2);

    }
}
