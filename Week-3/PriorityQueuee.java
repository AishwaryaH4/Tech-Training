
import java.util.*;
public class PriorityQueuee {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();      // Ascending sorted order.
        // PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());  // Descending sorted order.

        queue.add(10);
        queue.add(20);
        queue.add(5);
        queue.add(30);

        System.out.println("Priority Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);
    }
    
}
