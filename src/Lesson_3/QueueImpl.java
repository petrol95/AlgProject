/**
 * Algorithms and data structures. Lesson 3.
 *
 * @author Olga Petrova
 * @version dated Oct 17, 2018
 */

package Lesson_3;

public class QueueImpl implements Queue {

    public static final int DEFAULT_REAR = -1;
    public static final int DEFAULT_FRONT = 0;
    private int[] data;
    private int size;
    private int front;
    private int rear;

    public QueueImpl(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
        this.front = DEFAULT_FRONT;
        this.rear = DEFAULT_REAR;
    }

    @Override
    public void add(int value) {
        if (rear == data.length - 1)
            rear = DEFAULT_REAR;
        data[++rear] = value;
        size++;
    }

    @Override
    public int remove() {
        int value = data[front++];
        if (front == data.length)
            front = DEFAULT_FRONT;
        size--;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int peek() {
        return data[size - 1];
    }

    @Override
    public void display() {
        int currentSize = size;
        int currentFront = front;
        while (currentSize > 0) {
            System.out.println(data[currentFront++]);
            if (front == data.length)
                currentFront = DEFAULT_FRONT;
            currentSize--;
        }
    }
}
