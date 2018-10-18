package Lesson_3;

public class Convertion {

    private String input;

    public Convertion(String input) {
        this.input = input;
    }

    public String convertString() {
        String res = "";
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }
        for (int i = 0; i < input.length(); i++) {
            res += stack.pop();
        }
        return res;
    }
}
