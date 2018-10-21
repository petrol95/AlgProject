package Lesson_4;

import Lesson_3.Queue;

/**
 * Algorithms and data structures. Lesson 4.
 *
 * @author Olga Petrova
 * @version dated Oct 22, 2018
 */

public class LinkedQueueImpl implements Queue {

    private TwoSideLinkedList linkedList;

    public LinkedQueueImpl() {
        this.linkedList = new TwoSideLinkedListImpl();
    }

    @Override
    public void add(int value) {
        linkedList.addLast(value);
    }

    @Override
    public int remove() {
        return linkedList.remove().getData();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public void display() {
        linkedList.display();
    }

    @Override
    public int peek() {
        return 0;
    }
}
