import java.util.Arrays;

/**
 * Algorithms and data structures. Lesson 2.
 *
 * @author Olga Petrova
 * @version dated Oct 14, 2018
 */

public class MyArr {
    private int[] arr;
    private int size;

    public MyArr(int size) {
        this.size = 0;
        this.arr = new int[size];
    }

    // Current array size
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int i, int value) {
        this.arr[i] = value;
        this.size++;
    }

    @Override
    public String toString() {
        return "MyArr{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    // Insertion element into a sorted array
    public void insert(int value) {
        int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] > value)
                break;
        }
        for (int j = this.size; j > i; j--) {
            this.arr[j] = this.arr[j - 1];
        }
        this.arr[i] = value;
        this.size++;
    }

    // Deletion element from a sorted array
    public void delete(int value) {
        int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] == value)
                break;
        }
        for (int j = i; j < this.size - 1; j++) {
            this.arr[j] = this.arr[j + 1];
        }
        this.size--;
    }

    // Finding element in an array
    public boolean find(int value) {
        int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] == value)
                break;
        }
        return (i != this.size);
    }

    // Binary search
    public boolean binaryFind(int value) {
        int low = 0;
        int high = this.size - 1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (this.arr[mid] == value)
                return true;
            else if (value < this.arr[mid])
                high = mid;
            else
                low = mid + 1;
        }
        return false;
    }

    private void change(int i, int j) {
        int tmp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = tmp;
    }

    // Bubble sort
    public void sortBubble() {
        for (int i = this.size - 1; i > 1; i--)
            for (int j = 0; j < i; j++)
                if (this.arr[j] > this.arr[j + 1])
                    change(j, j + 1);
    }

    // Selection sort
    public void sortSelect() {
        int mark;
        for (int i = 0; i < this.size; i++) {
            mark = i;
            for (int j = i + 1; j < this.size; j++)
                if (this.arr[j] < this.arr[mark])
                    mark = j;
            change(i, mark);
        }
    }

    // Insertion sort
    public void sortInsert() {
        for (int i = 1; i < this.size; i++) {
            int temp = this.arr[i];
            int j = i;
            while (j > 0 && this.arr[j - 1] >= temp) {
                this.arr[j] = this.arr[j - 1];
                j--;
            }
            this.arr[j] = temp;
        }
    }

    // Copying array
    public void copyArray(MyArr arr) {
        System.arraycopy(this.arr, 0, arr.getArr(), 0, this.size);
        arr.setSize(this.size);
    }
}