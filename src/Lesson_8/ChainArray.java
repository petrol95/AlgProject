package Lesson_8;

import java.util.LinkedList;

/**
 * Algorithms and data structures. Lesson 8.
 *
 * @author Olga Petrova
 * @version dated Nov 05, 2018
 */

public class ChainArray {

    private LinkedList[] chainArray;
    private int maxSize;

    public ChainArray(int maxSize) {
        this.chainArray = new LinkedList[maxSize];
        for (int i = 0; i < maxSize; i++) {
            chainArray[i] = new LinkedList<Item>();
        }
    }

    public Item getItemFromList(LinkedList<Item> list, int key) {
        for (Item item : list) {
            if (item.getData() == key)
                return item;
        }
        return null;
    }


    public int hashFunc(int key) {
       return key % chainArray.length;
    }

    public void insert (Item item) {
        int index = hashFunc(item.getData());
        chainArray[index].add(item);
    }

    public boolean remove (Item item) {
        return remove(item.getData()) != null;
    }

    public Item remove (int key) {
        int index = hashFunc(key);
        if (this.find(key) == null)
            return null;
        else {
            Item removedItem = this.find(key);
            if (chainArray[index].remove(removedItem)) {
                return removedItem;
            } else
                return null;
        }
    }

    public Item find (int key) {
        int index = hashFunc(key);
        if (chainArray[index] == null)
            return null;
        else {
            return getItemFromList(chainArray[index], key);
        }
    }

    public void display () {
        for (int i = 0; i < chainArray.length; i++) {
            // if (chainArray[i].size() != 0)
                System.out.println(chainArray[i]);

        }
    }
}
