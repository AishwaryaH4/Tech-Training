public class InterpolationSearch {
    // Works on a sorted array (ascending), best when values are fairly uniform.
    // O(log log n) ; worst case is O(n).  

    public static int interpolationSearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            if (arr[low] == arr[high]) {
                return (arr[low] == target) ? low : -1;
            }

            int pos = low + (int) (((long) (target - arr[low]) * (high - low))
                    / (arr[high] - arr[low]));

            if (arr[pos] == target) return pos;
            if (arr[pos] < target) low = pos + 1;
            else high = pos - 1;
        }

        return -1;
    }

    public static void main(String[] args) {                    // works best for uniform distribution of values.
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int target = 50;
        int index = interpolationSearch(arr, target);
        System.out.println("Index: " + index); // 4
    }
}
