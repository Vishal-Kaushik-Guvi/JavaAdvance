import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Initial Stack: " + stack);

        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("Is stack empty? " + stack.empty());

        System.out.println("Position of 20 from top: " + stack.search(20));

        stack.push(60);
        System.out.println("Stack after pushing 60: " + stack);

        while (!stack.isEmpty()) {
            System.out.println("Removing: " + stack.pop());
        }

        System.out.println("Final stack (empty): " + stack);
    }
}
