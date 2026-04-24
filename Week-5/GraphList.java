
// Graph List

import java.util.*;

public class GraphList {
    int vertices;
    ArrayList<ArrayList<Integer>> list;
    GraphList(int v){
        vertices = v;
        list = new ArrayList<>();
        for(int i=0; i<vertices; i++){
            list.add(new ArrayList<>());
        }
    }
    void addEdge(int u, int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    void printGraph(){
        System.out.print("List Representation: " +list); 
        for(int i=0; i<vertices; i++){
            System.out.print(i+" -> ");
            for(int j : list.get(i)){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        GraphList g = new GraphList(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.printGraph();
    }
}
