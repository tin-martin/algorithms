
import java.util.*;
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
    
    public Boolean isCyclic(){
        int[] parent = new int[this.N];
        for(int i=0;i<this.N;i++){
            parent[i] = -1;
        }
        
        for(int i=0;i<this.N;i++){
            for(int j=0;j<this.N;j++){
                if(this.graph[i][j] != 0){
                    int x = this.find(parent,i);
                    int y = this.find(parent, j);
                    if(x == y){
                        return true;
                    }
                    this.union(parent,x,y);
                }
            }
        }
        return false;
    }
    
    public void union(int[] parent,int x, int y){
        parent[y] = x;
        //x is source
        //y is destination
    }
    
    public int find(int[] parent, int x){
        if(parent[x] == -1){
            return x;
        }
        return find(parent, parent[x]);
    }
    
}
public class DisjointSetCycleIdentification {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Graph g = new Graph(3);
        g.addEdge(0,1,2);
        g.addEdge(1,2,2);
        g.addEdge(2,0,2);

        System.out.println(g.isCyclic());
       
    }

}  
