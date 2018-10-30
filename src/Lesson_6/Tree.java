package Lesson_6;

public interface Tree {

    void add(Person value);

    Person remove(int id);

    Person find(int id);

    boolean isEmpty();

    void display();

    int getSize();

    void traverse(TraverseMode mode);

}
