
// Find Maximum Element in every sub array of size k

import java.util.*;

public class MaxSlidingWindow {

    // Returns an array where each element is the maximum
    // of a window (subarray) of size k
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        // Edge cases: invalid window size or empty array
        if (n == 0 || k <= 0 || k > n) return new int[0];

        // Max-heap (priority queue)
        // Each element is int[]: [value, index]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            // First priority: bigger value should come first
            if (a[0] != b[0]) return Integer.compare(b[0], a[0]);

            // If values are same, bigger index first (optional tie-breaker)
            return Integer.compare(b[1], a[1]);
        });

        // Number of windows = n - k + 1
        int[] ans = new int[n - k + 1];

        for (int i = 0; i < n; i++) {
            // Add current element with its index
            pq.offer(new int[] { nums[i], i });

            // Remove elements that are outside the current window
            // Current window start = i - k + 1
            // So valid indices are >= i - k + 1
            // Outdated indices are <= i - k
            while (!pq.isEmpty() && pq.peek()[1] <= i - k) {
                pq.poll();
            }

            // Window is ready only when i reaches k - 1
            if (i >= k - 1) {
                // Top of max-heap = maximum element in current window
                ans[i - k + 1] = pq.peek()[0];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        MaxSlidingWindow s = new MaxSlidingWindow();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        // Output: [3, 3, 5, 5, 6, 7]
        System.out.println(Arrays.toString(s.maxSlidingWindow(nums, k)));
    }
}
