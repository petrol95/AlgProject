/**
 * Algorithms and data structures. Lesson 3.
 *
 * @author Olga Petrova
 * @version dated Oct 17, 2018
 */

package Lesson_3;

public interface Stack {

    void push(int value);

    int pop();

    int peek();

    int getSize();

    boolean isEmpty();

    boolean isFull();

    void display();
}
