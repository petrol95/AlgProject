package Lesson_4;

import java.util.Iterator;

/**
 * Algorithms and data structures. Lesson 4.
 *
 * @author Olga Petrova
 * @version dated Oct 22, 2018
 */

public interface LinkIterator extends Iterator {

    void reset();

    boolean atEnd();

    void nextLink();

    Link getCurrent();

    void insertAfter(int value);

    void insertBefore(int value);

    int deleteCurrent();

    @Override
    boolean hasNext();

    @Override
    Link next();
}
