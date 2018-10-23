package Lesson_5;

public class Lesson5 {

    public static void main(String[] args) throws InterruptedException {

        int n = 5;
        countdown(n);

        // while (true) {
        //    System.out.println(n--);
        // }
    }

    private static int countdown(int n) throws InterruptedException {

        if (n < 0) {
            return n;
        }
        System.out.println(n);
        Thread.sleep(1000);
        return countdown(n - 1);
    }
}
