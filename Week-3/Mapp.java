
import java.util.*;
public class Mapp {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(10,"Apple");
        map.put(20,"Banana");
        map.put(30,"Cherry");



        System.out.println("Map: " + map);
        System.out.println("Value for 10: " + map.get(10));

        map.remove(20);
        System.out.println("After removal: " + map);
        System.out.println("Contains 30? " + map.containsKey(30));
        System.out.println("Contains value 'Cherry'? " + map.containsValue("Cherry"));

        map.put(40,"Grapes");
        System.out.println("Size: " + map.size());

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
