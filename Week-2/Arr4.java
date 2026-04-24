import java.util.Arrays;

public class Arr4 {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60};
        int n = a.length;
        int rev[] = new int[n];
        int count = 0;

        // reverse
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            rev[j] = a[i];

            // sum of even positions
            if (j % 2 == 0) {
                count = count + rev[j];
            }
        }

        System.out.println("Reversed array : " + Arrays.toString(rev));
        System.out.println("Sum of even positions : " + count);
    }
}
