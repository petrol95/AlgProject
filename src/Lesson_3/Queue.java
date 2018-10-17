/**
 * Algorithms and data structures. Lesson 3.
 *
 * @author Olga Petrova
 * @version dated Oct 17, 2018
 */

package Lesson_3;

public interface Queue {

    void addRight(int value);

    int removeLeft();

    boolean isEmpty();

    boolean isFull();

    int getSize();

    void display();
}
