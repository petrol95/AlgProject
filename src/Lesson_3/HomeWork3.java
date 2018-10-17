package Lesson_3;

/**
 * Algorithms and data structures. Lesson 3.
 *
 * @author Olga Petrova
 * @version dated Oct 17, 2018
 */

public class HomeWork3 {

    public static void main(String[] args) {
        testStack();
    }

    private static void testStack() {
        Stack stack = new StackImpl(5);
        int i = 1;

        while (!stack.isFull()) {
            stack.push(i++);
        }

        stack.pop();
        stack.pop();

        System.out.println("peek: " + stack.peek());

        System.out.println("display:");
        stack.display();

        System.out.println("display & clear:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("Stack is empty: " + stack.isEmpty());


    }
}
