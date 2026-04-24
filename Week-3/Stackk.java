public class Stackk {
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());     // or top()
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Position of 10: " + stack.search(10));
    }

    
}
