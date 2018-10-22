package Lesson_4;

import Lesson_3.Queue;
import Lesson_3.Stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Algorithms and data structures. Lesson 4.
 *
 * @author Olga Petrova
 * @version dated Oct 22, 2018
 */

public class HomeWork4 {

    public static void main(String[] args) {

        // Test LinkedList
        // LinkedList list = new SimpleLinkedListImpl();
        // LinkedList list = new TwoSideLinkedListImpl();
        TwoSideLinkedList list = new TwoSideLinkedListImpl();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.addLast(5);
        list.addLast(6);

        list.display();
        System.out.println(list.remove());
        System.out.println(list.remove(8));
        list.display();

        System.out.println("Find 2: " + list.search(2));
        System.out.println("Find 9: " + list.search(9));

        System.out.println("out");
        while (!list.isEmpty()) {
            System.out.println(list.remove());
        }

        // Test Stack
        System.out.println("test Stack");

        Stack stack = new LinkedStackImpl();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        stack.pop();
        stack.pop();

        System.out.println("peek: " + stack.peek());
        System.out.println("display:");
        stack.display();
        System.out.println("display & clear:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Stack is empty: " + stack.isEmpty());

        // test Queue
        System.out.println("test Queue");
        Queue queue = new LinkedQueueImpl();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        queue.display();
        System.out.println("remove two items:");
        queue.remove();
        queue.remove();
        queue.display();
        System.out.println("display & clear:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
        System.out.println("Queue is empty: " + queue.isEmpty());

        // test Iterator
        System.out.println("test Iterator");
        testIterator();

        // test Link Iterator
        System.out.println("\nLink Iterator");
        SimpleLinkedListImpl newList = new SimpleLinkedListImpl ();
        LinkIteratorImpl iter = new LinkIteratorImpl(newList);
        iter.insertAfter(1);
        iter.insertAfter(2);
        iter.insertAfter(3);
        newList.display();

        iter.reset();
        iter.insertBefore(4);
        newList.display();

        System.out.println("iterator at the end: " + iter.atEnd());
        System.out.println("current element: " + iter.getCurrent());
        iter.nextLink();
        System.out.println("current element after shift: " + iter.getCurrent());

        System.out.println("delete current element:");
        iter.deleteCurrent();
        newList.display();

    }

    private static void testIterator() {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        for (Integer value : linkedList) {
            // linkedList.remove(0);
            System.out.println(value);
        }

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            iterator.remove();
        }

        System.out.println("after iterator");
        for (Integer value : linkedList)
            System.out.println(value);
    }
}
