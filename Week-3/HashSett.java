
import java.util.*;
public class HashSett {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");                                  // Duplicate, will not be added

        System.out.println("HashSet: " + set);               // Unordered sequence of elements.
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        set.remove("Cherry");
        System.out.println("After removal: " + set);
        System.out.println("Size: " + set.size());

        set.clear();
        System.out.println("Is empty: " + set.isEmpty());
    }

     
}


// LinkedHashSet<String> set = new LinkedHashSet<>();   ->  for ordered sequence
// TreeSet<String> set = new TreeSet<>();               ->  for sorted sequence (in ascending order)