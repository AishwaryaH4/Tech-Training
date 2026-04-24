import java.util.Arrays;

public class Arr5 {
    public static void main(String[] args) {
        int[] a = {1, 0, 1, 0, 1, 0};

        int zeroCount = 0;

        // count zeros
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                zeroCount++;
        }

        // fill zeros first
        for (int i = 0; i < zeroCount; i++) {
            a[i] = 0;
        }

        // fill ones next
        for (int i = zeroCount; i < a.length; i++) {
            a[i] = 1;
        }

        System.out.println(Arrays.toString(a));      // [0, 0, 0, 1, 1, 1]
    }
}
