package Lesson_4;

public interface List {

    void add (Link value);

    Link remove();

    boolean isEmpty();

    int getSize();

    Link search(int value);

    Link remove (int value);

}
