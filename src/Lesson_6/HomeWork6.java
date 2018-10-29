package Lesson_6;

import java.util.Random;

/**
 * Algorithms and data structures. Lesson 6.
 *
 * @author Olga Petrova
 * @version dated Oct 29, 2018
 */

public class HomeWork6 {

    private static final int TREES_AMOUNT = 20;
    private static final int LEVELS_AMOUNT = 4;

    public static void main(String[] args) {

        TreeImpl[] tree = new TreeImpl[TREES_AMOUNT];
        int balancedTreesAmount = 0;

        for (int i = 0; i < TREES_AMOUNT; i++) {

            tree[i] = new TreeImpl();
            Random rand = new Random();

            while (tree[i].treeHeight() < LEVELS_AMOUNT) {
                tree[i].add(new Person(rand.nextInt(41) - 20, "Petr", 100)); // -20 <= id <= 20
            }
            tree[i].display();
            balancedTreesAmount += tree[i].isTreeBalanced() ? 1 : 0;
            System.out.println("Height = " + tree[i].treeHeight());
            System.out.println("balanced = " + tree[i].isTreeBalanced());
        }

        System.out.println("\n" + TREES_AMOUNT + " trees have been created");
        System.out.println("Balanced trees = " + balancedTreesAmount +
                " (" + (100 * balancedTreesAmount / TREES_AMOUNT) + " %)");

    }
}
