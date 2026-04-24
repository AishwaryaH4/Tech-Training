import java.util.Arrays;

public class Ar3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6};

        int n = a.length + 1; // full range should be 1..n
        boolean[] present = new boolean[n + 1];

        for (int x : a) {
            if (x >= 1 && x <= n) present[x] = true;
        }

        int missing = -1;
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missing = i;
                break;
            }
        }

        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = i + 1;
        }

        System.out.println("Input  = " + Arrays.toString(a));
        System.out.println("Missing number = " + missing);
        System.out.println("Output = " + Arrays.toString(output)); // [1, 2, 3, 4, 5, 6]
    }
}
