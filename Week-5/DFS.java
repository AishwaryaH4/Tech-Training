
import java.util.*;
public class DFS {
    int vertices;
    ArrayList<ArrayList<Integer>> list;

    DFS(int v) {
        vertices = v;
        list = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }

    void dfsHelper(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : list.get(node)) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    void dfs(int startNode) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS Traversal: ");
        dfsHelper(startNode, visited);
        System.out.println();
    }

    public static void main(String[] args) {
        DFS g = new DFS(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.dfs(0);
    }

}
