
// Floyd Warshall Algorithm


class FloydWarshall {
    static final int INF = 99999;

    public static void floydwarshalls(int A[][], int n) {

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {   
                    if (A[i][k] != INF && A[k][j] != INF) {
                        A[i][j] = Math.min(A[i][j], A[i][k] + A[k][j]);
                    }
                }
            }
        }

        System.out.println("Shortest path between the pairs");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(A[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;

        int A[][] = {
                {0, 3, INF, 7},
                {8, 0, 2, INF},
                {5, INF, 0, 1},
                {2, INF, INF, 0}
        };

        floydwarshalls(A, n);
    }
}