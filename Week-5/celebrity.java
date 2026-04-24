
// Celebrity Problem

public class celebrity {
    public static int findCelebrity(int[][] M, int n) {
        int candidate = 0;
        for (int i = 1; i < n; i++) {
            if (M[candidate][i] == 1) {
                candidate = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (M[candidate][i] == 1 || M[i][candidate] == 0) {
                    return -1;
                }
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[][] M = { { 0, 1, 1 },
                      { 0, 0, 1 },
                      { 0, 0, 0 }};

        int result = findCelebrity(M, 3);
        if (result == -1) {
            System.out.println("No Celebrity");
        } else {
            System.out.println("Celebrity ID: " + result);
        }
    }
}
