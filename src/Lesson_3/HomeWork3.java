/**
 * Algorithms and data structures. Lesson 3.
 *
 * @author Olga Petrova
 * @version dated Oct 17, 2018
 */

package Lesson_3;

public class HomeWork3 {

    public static void main(String[] args) {

        int i = 1;

        // test Stack
        System.out.println("Test Stack");
        Stack stack = new StackImpl(5);
        while (!stack.isFull()) {
            stack.push(i++);
        }
        System.out.println("remove two items:");
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

        // test Queue
        System.out.println("\nTest Queue");
        Queue queue = new QueueImpl(5);
        i = 1;
        while (!queue.isFull()) {
            queue.add(i++);
        }
        queue.display();
        System.out.println("remove two items:");
        queue.remove();
        queue.remove();
        queue.display();
        System.out.println("display & clear:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
        System.out.println("Queue is empty: " + queue.isEmpty());

        // test Priority Queue
        System.out.println("\nTest Priority Queue");
        Queue prQueue = new PriorityQueueImpl(5);
        prQueue.add(30);
        prQueue.add(50);
        prQueue.add(10);
        prQueue.add(40);
        prQueue.add(20);
        prQueue.display();
        System.out.println("remove all items:");
        while (!prQueue.isEmpty()) {
            System.out.println(prQueue.remove());
        }
        System.out.println("Queue is empty: " + prQueue.isEmpty());

        // test String convertion
        System.out.println("\nTest String convertion");
        String in = "porosenok";
        System.out.println("original string: " + in);
        System.out.println("convertion: " + new Convertion(in).convertString());

        // test MyDeque
        System.out.println("\nTest MyDeque");
        MyDeque deque = new MyDeque(6);
        deque.addRight(1);
        deque.addRight(2);
        deque.addRight(3);
        deque.addRight(4);
        System.out.println("add left two items");
        deque.addLeft(5);
        deque.addLeft(6);
        System.out.println("remove right two items:");
        deque.removeRight();
        deque.removeRight();
        System.out.println("remove & display:");
        deque.removeAndDisplay();
        System.out.println("Deque is empty: " + deque.isEmpty());
    }
}
