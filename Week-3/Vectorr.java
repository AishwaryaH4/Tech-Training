
import java.util.*;
public class Vectorr {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        System.out.println("Default Capacity: " + v.capacity());
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        System.out.println("Vector: " + v);
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());

        v.remove(2);
        System.out.println("After removal: " + v);
        System.out.println("Element at index 1: " + v.get(1));

        v.ensureCapacity(30);
        System.out.println("Capacity after ensureCapacity(30): " + v.capacity());

        for (int i : v) {
            System.out.print(i + " ");
        }
    }

    
}
