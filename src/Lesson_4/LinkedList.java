package Lesson_4;

/**
 * Algorithms and data structures. Lesson 4.
 *
 * @author Olga Petrova
 * @version dated Oct 22, 2018
 */

public interface LinkedList {

    void add(int value);

    Link remove();

    boolean isEmpty();

    int getSize();

    Link search(int value);

    Link remove(int value);

    void display();

    Link getFirstElement();

    void setFirstElement(Link element);

    LinkIteratorImpl getIterator();
}
