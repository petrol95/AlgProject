package Lesson_8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main8 {

    public static void main(String[] args) {
        testHashtable();

        System.out.println("\n---");

        Map<String, Integer> map = new HashMap<>();
        map.put("123", 123);
        map.put("234", 234);
        map.put("456", 456);

        System.out.println(map.get("234"));
        System.out.println(map.containsKey("456"));

        TreeSet<String> treeSet = new TreeSet(Comparator.reverseOrder());
        treeSet.add("abc");
        treeSet.add("zyx");

        for (String s : treeSet) {
            System.out.println(s);
        }
    }

    private static void testHashtable() {
        HashTable hashTable = new HashTable(10);

        Item item1 = new Item(2);
        Item item2 = new Item(7);
        Item item3 = new Item(32);
        Item item4 = new Item(15);
        Item item5 = new Item(17);

        hashTable.insert(item1);
        hashTable.insert(item2);
        hashTable.insert(item3);
        hashTable.insert(item4);
        hashTable.insert(item5);

        hashTable.display();


        System.out.println("Find 15:" + hashTable.find(15));
        System.out.println("Find 32:" + hashTable.find(32));
        System.out.println("Find 50:" + hashTable.find(50));

        hashTable.remove(2);
        hashTable.remove(item5);//17

        System.out.println("---");

        hashTable.display();
    }
}