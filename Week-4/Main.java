import java.util.*;

public class Main {
    static final int[] DR = {1, 0, 0, -1};      // D, L, R, U
    static final int[] DC = {0, -1, 1, 0};
    static final char[] MOVE = {'D', 'L', 'R', 'U'};

    static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        if (n == 0 || m[0][0] == 0 || m[n - 1][n - 1] == 0) return ans;

        boolean[][] vis = new boolean[n][n];
        dfs(0, 0, m, n, vis, new StringBuilder(), ans);
        return ans;
    }

    static void dfs(int r, int c, int[][] m, int n, boolean[][] vis,
                    StringBuilder path, ArrayList<String> ans) {
        if (r == n - 1 && c == n - 1) {
            ans.add(path.toString());
            return;
        }

        vis[r][c] = true;

        for (int i = 0; i < 4; i++) {
            int nr = r + DR[i];
            int nc = c + DC[i];

            if (nr >= 0 && nc >= 0 && nr < n && nc < n
                    && m[nr][nc] == 1 && !vis[nr][nc]) {
                path.append(MOVE[i]);
                dfs(nr, nc, m, n, vis, path, ans);
                path.deleteCharAt(path.length() - 1); // backtrack
            }
        }

        vis[r][c] = false; // backtrack
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        ArrayList<String> paths = findPath(m, n);

        if (paths.isEmpty()) {
            System.out.println(-1);
        } else {
            for (String p : paths) {
                System.out.print(p + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
