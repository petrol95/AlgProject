package Lesson_8;

public class HashTable {

    private static final int DOUBLE_HASH_CONST = 5;

    private Item[] hashArray;
    private int currentSize;

    public HashTable(int maxSize) {
        this.hashArray = new Item[maxSize];
        this.currentSize = 0;
    }

    public int hashFunc(int key) {
        return key % hashArray.length;
    }

    private int hashFuncDouble(int key) {
        return DOUBLE_HASH_CONST - (key % DOUBLE_HASH_CONST);
    }

    public int hashFunc(Item item) {
        return hashFunc(item.hashCode());
    }

    public void insert(Item item) {
        int index = hashFunc(item);
        int stepSize = hashFuncDouble(item.getData());

        int count = 0;

        while (hashArray[index] != null && count < hashArray.length) {
            index += stepSize;
            index %= hashArray.length;
            count++;
        }

        hashArray[index] = item;

    }

    public boolean remove(Item item) {
        return remove(item.getData()) != null;
    }

    public Item remove(int key) {
        int index = hashFunc(key);
        int stepSize = hashFuncDouble(key);

        int count = 0;

        while (hashArray[index] != null && count < hashArray.length) {
            if (hashArray[index].getData() == key) {
                Item removedItem = hashArray[index];
                hashArray[index] = null;
                return removedItem;
            }
            index += stepSize;
            index %= hashArray.length;
            count++;
        }

        return null;
    }

    public Item find(int key) {
        int index = hashFunc(key);
        int stepSize = hashFuncDouble(key);

        int count = 0;

        while (hashArray[index] != null && count < hashArray.length) {
            if (hashArray[index].getData() == key) {
                return hashArray[index];
            }

            index += stepSize;
            index %= hashArray.length;
            count++;
        }

        return null;
    }

    public void display() {
        for (int i = 0; i < hashArray.length; i++) {
//            if (hashArray[i] != null) {
            System.out.println(hashArray[i]);
//            }
        }
    }


}
