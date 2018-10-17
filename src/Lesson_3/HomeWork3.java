/**
 * Algorithms and data structures. Lesson 3.
 *
 * @author Olga Petrova
 * @version dated Oct 17, 2018
 */

package Lesson_3;

public class HomeWork3 {

    public static void main(String[] args) {
        testStack();
    }

    private static void testStack() {

        // test Stack
        /* Stack stack = new StackImpl(5);
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
        System.out.println("Stack is empty: " + stack.isEmpty()); */

        // test Queue
        Queue queue = new QueueImpl(5);
        int value = 1;
        while (!queue.isFull()) {
            queue.addRight(value++);
        }
        queue.display();

        System.out.println("remove");
        queue.removeLeft();
        queue.removeLeft();
        queue.display();

        System.out.println("display & clear");
        while (!queue.isEmpty()) {
            System.out.println(queue.removeLeft());
        }
        System.out.println("Queue is empty: " + queue.isEmpty());

    }
}
