package Lesson_4;

/**
 * Algorithms and data structures. Lesson 4.
 *
 * @author Olga Petrova
 * @version dated Oct 22, 2018
 */

public class TwoSideLinkedListImpl extends SimpleLinkedListImpl implements TwoSideLinkedList {

    private Link lastElement;

    @Override
    public void addLast(int value) {
        Link link = new Link(value);
        if (isEmpty())
            firstElement = link;
        else
            lastElement.setNext(link);
        lastElement = link;
        size++;
    }

    @Override
    public Link remove() {
        Link removedLink = super.remove();
        if (isEmpty())
            lastElement = null;
        return removedLink;
    }

    @Override
    public void add(int value) {
        super.add(value);
        if (getSize() == 1)
            lastElement = firstElement;
    }

    @Override
    public Link remove(int value) {
        Link removedLink = super.remove(value);
        if (isEmpty())
            lastElement = null;
        return removedLink;
    }
}
