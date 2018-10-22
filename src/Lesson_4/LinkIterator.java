package Lesson_4;

/**
 * Algorithms and data structures. Lesson 4.
 *
 * @author Olga Petrova
 * @version dated Oct 22, 2018
 */

public interface LinkIterator {

    void reset();

    boolean atEnd();

    void nextLink();

    Link getCurrent();

    void insertAfter(int value);

    void insertBefore(int value);

    int deleteCurrent();

}
