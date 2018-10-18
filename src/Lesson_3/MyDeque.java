package Lesson_3;

public class MyDeque extends QueueImpl {

    public MyDeque(int maxSize) {
        super(maxSize);
    }

    public void addRight(int value) {
        super.add(value);
    }

    public void addLeft(int value) {
        if (front != DEFAULT_FRONT) {
            data[--front] = value;
            size++;
        } else {
            System.out.println("impossible");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int removeLeft() {
        return super.remove();
    }

    public int removeRight() {
        if (rear != DEFAULT_REAR) {
            size--;
            return data[--rear];
        } else {
            System.out.println("impossible");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean isFull() {
        return super.isFull();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public int peek() {
        return super.peek();
    }

    @Override
    public void display() {
        super.display();
    }
}
