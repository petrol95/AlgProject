package Lesson_5;

/**
 * Algorithms and data structures. Lesson 5.
 *
 * @author Olga Petrova
 * @version dated Oct 24, 2018
 */

public class HelloBye {

    public static void main(String[] args) {
        hello("Artem");
    }

    private static void hello(String name) {
        print("Hello " + name + "!");
        bye(name);
    }

    private static void bye(String name) {
        print("Good bye, " + name + "!");
    }

    private static void print(String s) {
        System.out.println(s);
    }

}
