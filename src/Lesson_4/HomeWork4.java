package Lesson_4;

public class HomeWork4 {

    public static void main(String[] args) {

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


    }
}
