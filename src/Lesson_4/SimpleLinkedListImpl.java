package Lesson_4;

import java.util.Iterator;

/**
 * Algorithms and data structures. Lesson 4.
 *
 * @author Olga Petrova
 * @version dated Oct 22, 2018
 */

public class SimpleLinkedListImpl implements LinkedList, Iterable {

    protected Link firstElement;
    protected int size;


    public SimpleLinkedListImpl() {
        this.size = 0;
    }

    @Override
    public void add(int value) {
        Link link = new Link (value);
        link.setNext(firstElement);
        firstElement = link;
        size++;
    }

    @Override
    public Link getFirstElement() {
        return firstElement;
    }

    @Override
    public void setFirstElement(Link firstElement) {
        this.firstElement = firstElement;
    }

    @Override
    public Link remove() {
        Link temp = firstElement;
        firstElement = temp.getNext();
        size--;
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return firstElement == null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Link search(int value) {
        Link currentLink = firstElement;

        while (currentLink != null) {
            if (currentLink.getData() == value)
                return currentLink;
            currentLink = currentLink.getNext();
        }
        return null;
    }

    @Override
    public Link remove(int value) {
        Link currentLink = firstElement;
        Link previousLink = null;

        while (currentLink != null) {
            if (currentLink.getData() == value)
                break;
            previousLink = currentLink;
            currentLink = currentLink.getNext();
        }

        if (currentLink == null) // value was not found
            return null;

        if (previousLink == null) // removing first element
            firstElement = currentLink.getNext();
        else
            previousLink.setNext(currentLink.getNext());
        size--;
        return currentLink;
    }

    @Override
    public void display() {
        Link currentLink = firstElement;

        while (currentLink != null) {
            System.out.print(currentLink);
            System.out.print("->");
            currentLink = currentLink.getNext();
        }

        System.out.println();
    }

    @Override
    public LinkIteratorImpl getIterator() {
        return new LinkIteratorImpl(this);
    }

    @Override
    public Iterator iterator() {
        return this.getIterator();
    }

}
