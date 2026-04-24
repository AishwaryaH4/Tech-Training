  
// Queue Operations

import java.util.*;
public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Add elements to the queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Queue: " + q);

        // Remove the front element
        int removed = q.remove();
        System.out.println("Removed element: " + removed);

        // Peek at the front element
        int head = q.peek();
        System.out.println("Head of queue: " + head);

        // Size of the queue
        System.out.println("Queue size: " + q.size());

        // Check if the queue is empty
        System.out.println("isEmpty: "+q.isEmpty());

        // Display final queue
        System.out.println("Final Queue: " + q);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}

// q.poll(); -> remove safely
// q.offer(10); -> add safely