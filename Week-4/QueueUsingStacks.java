
// Queue using Stack

import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public QueueUsingStacks() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void enqueue(int data) {
        inputStack.push(data);
    }

    public int dequeue() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        if (outputStack.isEmpty()) {
            return -1; // queue is empty
        } else {
            return outputStack.pop();
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20
        System.out.println(q.dequeue()); // 30
        System.out.println(q.dequeue()); // -1
    }
}
