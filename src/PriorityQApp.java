import java.io.IOException;

/**
 * Algorithms and data structures. Lesson 2.
 *
 * @author Olga Petrova
 * @version dated Oct 14, 2018
 */

public class PriorityQApp {
    public static void main(String[] args) throws IOException {
        PriorityQueue q = new PriorityQueue(5);
        q.insert(30);
        q.insert(50);
        q.insert(10);
        q.insert(40);
        q.insert(20);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
