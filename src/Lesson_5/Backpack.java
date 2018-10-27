package Lesson_5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Algorithms and data structures. Lesson 5.
 *
 * @author Olga Petrova
 * @version dated Oct 25, 2018
 */

public class Backpack {

    private int packWeight; // target backpack weight
    private int[] weight; // weights array
    private int[] cost; // costs array
    private int size; // size of all arrays
    private int[] index; // indices array to rotate
    protected int bestCost; // max cost
    protected int totalWeight; // total weight of belongings forming max cost
    protected Queue<Integer> staff; // indices of belongings forming max cost
    protected int step; // number of recursive calls

    private Backpack(int packWeight, int[] weight, int[] cost) {
        this.packWeight = packWeight;
        this.weight = weight;
        this.cost = cost;
        this.size = weight.length;
        index = new int[this.size];
        staff = new LinkedList<Integer>();
        for (int i = 0; i < this.size; i++)
            index[i] = i;
        bestCost = 0;
        totalWeight = 0;
        step = 0;
    }

    private void rotateIndex(int newSize) { // rotation indices of belongings
        int pos = size - newSize;
        int temp = index[pos];
        for (int i = pos + 1; i < size; i++)
            index[i - 1] = index[i];
        index[size - 1] = temp;
    }

    private void pack(int newSize) {
        int localWeight = 0;
        int localCost = 0;
        step++;
        for (int i = 0; i < newSize; i++)
            localWeight += weight[index[i]];
        if (localWeight <= packWeight) {
            for (int i = 0; i < newSize; i++)
                localCost += cost[index[i]];
            if (localCost > bestCost) {
                bestCost = localCost;
                totalWeight = localWeight;
                while (!staff.isEmpty()) {
                    staff.remove();
                }
                for (int i = 0; i < newSize; i++)
                    staff.add(index[i] + 1); // staff number in user logic
                if (newSize == size) // taking all the belongings, base case 1
                    return;
            }
        }

        if(newSize == 1) // base case 2
            return;

        for (int i = 0; i < newSize; i++) {
            pack(newSize - 1); // recursive call
            rotateIndex(newSize);
        }
    }

    public static void main(String[] args) {
        // Test case 1
        System.out.println("Test case 1");
        int[] weight = {1, 2, 4, 2, 1};
        int[] cost =  {600, 5000, 1500, 40000, 500};
        System.out.println("weights = " + Arrays.toString(weight));
        System.out.println("costs = " + Arrays.toString(cost));
        Backpack backpack = new Backpack(15, weight, cost);
        System.out.println("Backpack weight = 15");
        backpack.pack(5);
        System.out.println("final cost = " + backpack.bestCost);
        System.out.println("final weight = " + backpack.totalWeight);
        System.out.println("need to take the belongings of following numbers: " + backpack.staff.toString());
        System.out.println("number of steps = " + backpack.step);

        // Test case 2
        System.out.println("\nTest case 2");
        int[] weight2 = {1, 2, 3};
        int[] cost2 =  {3, 8, 2};
        System.out.println("weights = " + Arrays.toString(weight2));
        System.out.println("costs = " + Arrays.toString(cost2));
        Backpack backpack2 = new Backpack(3, weight2, cost2);
        System.out.println("Backpack weight = 3");
        backpack2.pack(3);
        System.out.println("final cost = " + backpack2.bestCost);
        System.out.println("final weight = " + backpack2.totalWeight);
        System.out.println("need to take the belongings of following numbers: " + backpack2.staff.toString());
        System.out.println("number of steps = " + backpack2.step);

        // Test case 3
        System.out.println("\nTest case 3");
        int[] weight3 = {15, 20, 3, 15, 6};
        int[] cost3 =  {10, 8, 1, 17, 5};
        System.out.println("weights = " + Arrays.toString(weight3));
        System.out.println("costs = " + Arrays.toString(cost3));
        Backpack backpack3 = new Backpack(40, weight3, cost3);
        System.out.println("Backpack weight = 40");
        backpack3.pack(5);
        System.out.println("final cost = " + backpack3.bestCost);
        System.out.println("final weight = " + backpack3.totalWeight);
        System.out.println("need to take the belongings of following numbers: " + backpack3.staff.toString());
        System.out.println("number of steps = " + backpack3.step);
    }

}

