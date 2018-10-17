/**
 * Algorithms and data structures. Lesson 3.
 *
 * @author Olga Petrova
 * @version dated Oct 17, 2018
 */

package Lesson_3;

import java.util.Arrays;

public class StackImpl implements Stack {

    private int[] data;
    private int size;

    public StackImpl(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
    }

    @Override
    public void push(int value) {
        data[size++] = value;
    }

    @Override
    public int pop() {
       return data[--size];
    }

    @Override
    public int peek() {
        return data[size - 1];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size >= data.length;
    }

    @Override
    public void display() {
        for (int i = size - 1; i >= 0; i--)
            System.out.println(data[i]);
    }
}
