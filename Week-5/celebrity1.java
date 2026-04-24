class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        int i = 0, j = n - 1;

        // Step 1: Find candidate
        while (i < j) {
            if (mat[i][j] == 1) {
                i++;
            } else {
                j--;
            }
        }

        int candidate = i;

        // Step 2: Optimized verification (early exit)
        for (int k = 0; k < n; k++) {
            if (k == candidate) continue;

            if (mat[candidate][k] == 1) return -1; // knows someone ❌
            if (mat[k][candidate] == 0) return -1; // not known by someone ❌
        }

        return candidate;
    }
}