package algorithm.Graph;

import algorithm.linear.Queue;

public class Graph {
    //顶点数目
    private final int V;
    //边数目
    private int E;
    private Queue<Integer>[] adj;

    public Graph( int V){
        this.V = V;
        this.E =0;
        this.adj = new Queue[V];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<Integer>();

        }

    }
    public int v(){
        return V;
    }
    public int E(){
        return E;
    }
    //增加一条边
    public void addEdge(int v , int  w){
        adj[v].enqueue(w);
        adj[w].enqueue(v);
        E++;

    }
    public Queue<Integer> adj(int v){
        return adj[v];
    }




}
