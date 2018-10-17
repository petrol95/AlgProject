/**
 * Algorithms and data structures. Lesson 3.
 *
 * @author Olga Petrova
 * @version dated Oct 17, 2018
 */

package Lesson_3;

public class PriorityQueueImpl implements Queue {

    private int[] data;
    private int size;

    public PriorityQueueImpl(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
    }

    @Override
    public void add(int value) {
        int i = 0;
        if (isEmpty())
            data[size++] = value;
        else {
            for (i = size - 1; i >= 0 ; i--)
                if (value > data[i])
                    data [i + 1] = data [i];
                else
                    break;
            data[i + 1] = value;
            size++;
            }
    }

    @Override
    public int remove() {
        return data[--size];
    }

    @Override
    public int peek() {
        return data[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        for (int i = 0; i < size; i++)
            System.out.println(data[i]);
    }
}
