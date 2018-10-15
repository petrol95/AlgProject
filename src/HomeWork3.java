/**
 * Algorithms and data structures. Lesson 2.
 *
 * @author Olga Petrova
 * @version dated Oct 14, 2018
 */

public class HomeWork3 {
    private static int n;

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.remove();
        q.remove();

        q.insert(50);
        q.insert(60);
        q.insert(70);
        q.insert(80);

        while(!q.isEmpty()) {
            n = q.remove();
        }

        System.out.println(n);

    }
}
