import java.util.Arrays;

public class Arr8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n=a.length;

        int first = a[0];
        for (int i = 1; i < n; i++) {
            a[i-1] = a[i];
        }
        a[n-1] = first;

        System.out.println(Arrays.toString(a)); 
    }
}
