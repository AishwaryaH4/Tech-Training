public class Arr2 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 2, 1};

        int min = ar[0], max = ar[0];

        // Find min and max
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < min) min = ar[i];
            if (ar[i] > max) max = ar[i];
        }

        int[] freq = new int[max - min + 1];

        // Count frequency
        for (int i = 0; i < ar.length; i++) {
            freq[ar[i] - min]++;
        }

        // Print elements that appear once (original order)
        boolean first = true;
        for (int i = 0; i < ar.length; i++) {
            if (freq[ar[i] - min] == 1) {
                if (!first) System.out.print(",");
                System.out.print(ar[i]);
                first = false;
            }
        }
    }
    
}


