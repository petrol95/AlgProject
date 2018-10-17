/**
 * Algorithms and data structures. Lesson 3.
 *
 * @author Olga Petrova
 * @version dated Oct 17, 2018
 */

package Lesson_3;

public class HomeWork3 {

    public static void main(String[] args) {

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
        /* Queue queue = new QueueImpl(5);
        int value = 1;
        while (!queue.isFull()) {
            queue.add(value++);
        }
        queue.display();

        System.out.println("remove");
        queue.remove();
        queue.remove();
        queue.display();

        System.out.println("display & clear");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
        System.out.println("Queue is empty: " + queue.isEmpty()); */

        // test Priority Queue
        Queue prQueue = new PriorityQueueImpl(5);
        prQueue.add(30);
        prQueue.add(50);
        prQueue.add(10);
        prQueue.add(40);
        prQueue.add(20);

        prQueue.display();

        System.out.println("remove");
        while (!prQueue.isEmpty()) {
            System.out.println(prQueue.remove());
        }

        System.out.println("Queue is empty: " + prQueue.isEmpty());

    }
}
