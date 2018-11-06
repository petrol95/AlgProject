package Lesson_8;

/**
 * Algorithms and data structures. Lesson 8.
 *
 * @author Olga Petrova
 * @version dated Nov 05, 2018
 */

public class HomeWork8 {

    public static void main(String[] args) {

        ChainArray chainArray1 = new ChainArray(10);
        System.out.println("Test size = 10");
        TestChainArray(chainArray1);

        ChainArray chainArray2 = new ChainArray(4);
        System.out.println("\nTest size = 4");
        TestChainArray(chainArray2);

    }

    private static void TestChainArray(ChainArray chainArray) {
        Item item1 = new Item(2);
        Item item2 = new Item(7);
        Item item3 = new Item(32);
        Item item4 = new Item(15);
        Item item5 = new Item(17);

        chainArray.insert(item1);
        chainArray.insert(item2);
        chainArray.insert(item3);
        chainArray.insert(item4);
        chainArray.insert(item5);

        chainArray.display();

        System.out.println("---");
        System.out.println("Find 15: " + chainArray.find(15));
        System.out.println("Find 32: " + chainArray.find(32));
        System.out.println("Find 50: " + chainArray.find(50));

        System.out.println("---");
        System.out.println("Remove 2: " + chainArray.remove(2));
        System.out.println("Remove item5: " + chainArray.remove(item5)); // 17

        System.out.println("---");
        chainArray.display();
    }
}
