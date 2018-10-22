package Lesson_4;

/**
 * Algorithms and data structures. Lesson 4.
 *
 * @author Olga Petrova
 * @version dated Oct 22, 2018
 */

public class LinkIteratorImpl implements LinkIterator {

    private Link currentElement;
    private Link previousElement;
    private SimpleLinkedListImpl list;

    public LinkIteratorImpl(SimpleLinkedListImpl list) {
        this.list = list;
        this.reset();
    }

    @Override
    public void reset() {
        currentElement = list.getFirstElement();
        previousElement = null;
    }

    @Override
    public boolean atEnd() {
        return currentElement.getNext() == null;
    }

    @Override
    public void nextLink() {
        previousElement = currentElement;
        currentElement = currentElement.getNext();
    }

    @Override
    public Link getCurrent() {
        return currentElement;
    }

    @Override
    public void insertAfter(int value) {
        Link link = new Link(value);
        if (list.isEmpty()) {
            list.setFirstElement(link);
            currentElement = link;
        } else {
            link.setNext(currentElement.getNext());
            currentElement.setNext(link);
            nextLink();
        }

    }

    @Override
    public void insertBefore(int value) {
        Link link = new Link(value);
        if (previousElement == null) {
            link.setNext(list.getFirstElement());
            list.setFirstElement(link);
            reset ();
        } else {
            link.setNext(previousElement.getNext());
            previousElement.setNext(link);
            currentElement = link;
        }
    }

    @Override
    public int deleteCurrent() {
        int value = currentElement.getData();
        if (previousElement == null) {
            list.setFirstElement(currentElement.getNext());
            reset();
        } else {
            previousElement.setNext(currentElement.getNext());
            if (atEnd())
                reset();
            else
                currentElement = currentElement.getNext();
        }
        return value;
    }



}
