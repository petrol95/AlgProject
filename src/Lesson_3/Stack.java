/**
 * Algorithms and data structures. Lesson 3.
 *
 * @author Olga Petrova
 * @version dated Oct 17, 2018
 */

package Lesson_3;

public interface Stack {

    // adding
    void push(int value);

    // removing
    int pop();

    // reading top element
    int peek();

    int getSize();

    boolean isEmpty();

    boolean isFull();

    // printing
    void display();
}
