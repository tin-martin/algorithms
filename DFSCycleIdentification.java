va.util.*;
import java.lang.*;


class Graph{
    int[][] graph;
    int N;
    public Graph(int N){
        this.N = N;
        this.graph = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                this.graph[i][j] = 0;
            }
        }
    }
    
    public void addEdge(int a, int b, int w){
        this.graph[a][b] = w;
    }
    
    public Boolean isCyclic_DFS(int src){
        
        Boolean[] isVisited = new Boolean[this.N];
        for(int i=0;i<this.N;i++){
            isVisited[i] = false;
        }
     
        ArrayList<Integer> stack = new ArrayList<Integer>();
        stack.add(src);
        while(!stack.isEmpty()){
            int u = stack.remove(stack.size()-1);
            if(isVisited[u]){
                return true;
            }
            isVisited[u] = true;
            for(int v=0;v<this.N;v++){
                if(this.graph[v][u] > 0){
                    stack.add(v);
                }
            }
        }
        return false;
    }
    
    
}
public class DFSCycleIdentification {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Graph g = new Graph(3);
        g.addEdge(0,1,2);
        g.addEdge(1,2,2);
        g.addEdge(2,0,2);

        System.out.println(g.isCyclic_DFS());
       
    }

}  
