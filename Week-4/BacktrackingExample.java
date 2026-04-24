import java.util.*;

public class BacktrackingExample {
    static void subsets(int[] arr, int i, List<Integer> current) {    // i-> index, current-> subset, arr-> array.
        if (i == arr.length) {
            System.out.println(current);
            return;
        }

        // Choice 1: include arr[i]
        current.add(arr[i]);
        subsets(arr, i + 1, current);

        // Backtrack: undo include
        current.remove(current.size() - 1);   // remove repeated value

        // Choice 2: exclude arr[i]
        subsets(arr, i + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subsets(arr, 0, new ArrayList<>());
    }
}
