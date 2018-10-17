/**
 * Algorithms and data structures. Lesson 3.
 *
 * @author Olga Petrova
 * @version dated Oct 17, 2018
 */

package Lesson_3;

public interface Queue {

    void add(int value); // add right

    int remove(); // remove left

    boolean isEmpty();

    boolean isFull();

    int getSize();

    void display();

    int peek();
}
