/**
 * Algorithms and data structures. Lesson 2.
 *
 * @author Olga Petrova
 * @version dated Oct 14, 2018
 */

public class PriorityQueue {
    private int size;
    private int[] queueArray;
    private int items;

    public PriorityQueue(int size) {
        this.size = size;
        queueArray = new int[this.size];
        items = 0;
    }

    public void insert(int elem) {
        int i;
        if (items == 0)
            queueArray[items++] = elem;
        else {
            for (i = items - 1; i >= 0; i--) {
                if (elem > queueArray[i])
                    queueArray[i + 1] = queueArray[i];
                else
                    break;
            }
            queueArray[i + 1] = elem; // inserting element
            items++;
        }
    }

    public int remove() {
        return queueArray[--items];
    }

    public int peek() {
        return queueArray[items - 1];
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == size);
    }
}
