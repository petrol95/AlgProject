/**
 * Algorithms and data structures. Lesson 3.
 *
 * @author Olga Petrova
 * @version dated Oct 15, 2018
 */

public class Queue {
    private int size;
    private int[] queue;
    private int front;
    private int rear;
    private int items;

    public Queue(int size) {
        this.size = size;
        this.queue = new int[this.size];
        this.front = 0;
        this.rear = -1;
        this.items = 0;
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == size);
    }

    public int getSize() {
        return items;
    }

    public void insert(int elem) {
        if (rear == size - 1)
            rear = -1;
        queue[++rear] = elem;
        items++;
    }

    public int remove() {
        int temp = queue[front++];
        if (front == size)
            front = 0;
        items--;
        return temp;
    }

    public int peek() {
        return queue[front];
    }
}
