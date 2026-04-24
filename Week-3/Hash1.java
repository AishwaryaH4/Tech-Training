
// Hashing with Separate Chaining : 


import java.util.*;

public class Hash1 {
    static final int SIZE = 10;
    static LinkedList<Integer>[] table = new LinkedList[SIZE];

    static void insert(int key) {
        int index = key % SIZE;
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        table[index].add(key);                            // always add (chaining)
    }

    static void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " -> ");
            if (table[i] != null) {
                for (int value : table[i]) 
                    System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        insert(5); 
        insert(15); 
        insert(25); 
        insert(35); 
        insert(45); 
        insert(55);
        display();
    }
}
