package Lesson_5;

import Lesson_2.MyArr;

public class RecurrentSortedArray extends MyArr {

    public RecurrentSortedArray(int maxSize) {
        super(maxSize);
    }

    @Override
    protected int binaryFind(int value) {
        return super.binaryFind(value);
    }

    private int binaryFind(int value, int low, int high) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;
        if (arr[mid] == value)
            return mid;

        if (value < arr[mid])
            return binaryFind(value, low, mid - 1);
        else
            return binaryFind(value, mid + 1, high);
    }

    public static void main(String[] args) {
        MyArr array = new RecurrentSortedArray(5);
        System.out.println(array);
        System.out.println(array.insert(3));
        System.out.println(array.insert(2));
        System.out.println(array.insert(4));

        System.out.println(array);
        System.out.println(array.insert(5));
        System.out.println(array.insert(1));
        System.out.println(array.insert(6));
        System.out.println(array);

        System.out.println("Find 3: " + array.find(3));
        System.out.println("Find 81: " + array.find(81));
    }
}
