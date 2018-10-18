package Lesson_3;

public class MyDeque extends QueueImpl {

    public MyDeque(int maxSize) {
        super(maxSize);
    }

    public void addRight(int value) {
        super.add(value);
    }

    public void addLeft(int value) {
        if (front == DEFAULT_FRONT)
            front = data.length;
        data[--front] = value;
        size++;
    }

    public int removeLeft() {
        return super.remove();
    }

    public int removeRight() {
        if (rear == DEFAULT_REAR)
            rear = data.length;
        size--;
        return data[--rear];
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

    public void removeAndDisplay() {
        while (!isEmpty()) {
            System.out.println(removeLeft());
        }
    }
}
