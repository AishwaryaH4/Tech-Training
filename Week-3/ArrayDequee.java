public class ArrayDequee {
    public static void main(String[] args) {
        java.util.ArrayDeque<Integer> deque = new java.util.ArrayDeque<>();

        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(30);

        System.out.println("Deque: " + deque);
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());
        System.out.println("Popped element: " + deque.pollFirst());
        System.out.println("Deque after poll: " + deque);
        System.out.println("Remove First: " + deque.removeFirst());
        System.out.println("Remove Last: " + deque.removeLast());
    }
    
}
