import java.util.*;

class Arr1 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,3,2,1};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
                return;
            }
        }

        // If the unique element is the last one
        System.out.println(arr[arr.length - 1]);
    }
}