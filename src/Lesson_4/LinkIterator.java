package Lesson_4;

public interface LinkIterator {

    void reset();

    boolean atEnd();

    void nextLink();

    Link getCurrent();

    void insertAfter(int value);

    void insertBefore(int value);

    int deleteCurrent();

}
