package Lesson_6;

public interface Node {

    void setData(Person value);
    Person getData();

    int getKey();

    Node getLeftChild();
    Node getRightChild();

    void setRightChild(Node rightChild);
    void setLeftChild(Node leftChild);

    Node getChildByKey(int key);

    boolean isLeftChild(int key);

    boolean isLeaf();

    void display();
}