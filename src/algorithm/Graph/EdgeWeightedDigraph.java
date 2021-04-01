package algorithm.Graph;


import algorithm.linear.Queue;

public class EdgeWeightedDigraph {
    //顶点总数
    private final int V;
    //边的总数
    private int E;
    //邻接表
    private Queue<Edge>[] adj;

    //创建一个含有V个顶点的空加权有向图
    public EdgeWeightedDigraph(int V) {
        //初始化顶点数量
        this.V = V;
        //初始化边的数量
        this.E = 0;
        //初始化邻接表
        this.adj = new Queue[V];

        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<Edge>();
        }
    }

    //获取图中顶点的数量
    public int V() {
        return V;
    }

    //获取图中边的数量
    public int E() {
        return E;
    }


    //向加权有向图中添加一条边e
    public void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        adj[v].enqueue(e);
        adj[w].enqueue(e);
        E++;

    }

    //获取由顶点v指出的所有的边
    public Queue<Edge> adj(int v) {
        return adj[v];
    }

    //获取加权有向图的所有边
    public Queue<Edge> edges() {
        //创建队列对象存储所有边
        Queue<Edge> allEdges = new Queue<>();
        //遍历图中的每一个顶点,找到该顶点的邻接表,邻接表存储了该顶点关联的每一条边;
        for(int v = 0 ;v<V;v++){
            for (Edge e: adj(v)){
               if(e.other(v)<v){
                   allEdges.enqueue(e);
               }

            }
        }return allEdges;


    }
}
