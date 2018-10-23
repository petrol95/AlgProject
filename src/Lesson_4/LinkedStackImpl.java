package Lesson_4;

import Lesson_3.Stack;

/**
 * Algorithms and data structures. Lesson 4.
 *
 * @author Olga Petrova
 * @version dated Oct 22, 2018
 */

public class LinkedStackImpl implements Stack {

    private LinkedList linkedList;

    public LinkedStackImpl() {
        this.linkedList = new SimpleLinkedListImpl();
    }

    @Override
    public void push(int value) {
        linkedList.add(value);
    }

    @Override
    public int pop() {
        return linkedList.remove().getData();
    }

    @Override
    public int peek() {
        return linkedList.getFirstElement().getData();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
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
    public void display() {
        linkedList.display();
    }
}
