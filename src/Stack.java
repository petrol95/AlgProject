/**
 * Algorithms and data structures. Lesson 3.
 *
 * @author Olga Petrova
 * @version dated Oct 16, 2018
 */

public class Stack {
    private int size;
    private int[] stack;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[this.size];
        this.top = -1; // empty stack
    }

    public void push(int elem) {
        this.stack[++this.top] = elem;
    }

    public int pop() {
        return this.stack[this.top--];
    }

    public int peek() {
        return this.stack[this.top];
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public boolean isFull() {
        return (this.top == this.size - 1);
    }
}
