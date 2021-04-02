package algorithm.Graph;
//加权有向图
import algorithm.linear.Queue;


public class EdgeWeightedGraph {
    //顶点总数
    private final int V;
    //边的总数
    private int E;
    //邻接表
    private Queue<DirectedEdge>[] adj;

    //创建一个含有V个顶点的空加权无向图
    public EdgeWeightedGraph(int V) {
        //初始化顶点数量
        this.V = V;
        //初始化边的数量
        this.E = 0;
        //初始化邻接表
        this.adj = new Queue[V];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<DirectedEdge>();
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


    //向加权无向图中添加一条边e
    public void addEdge(DirectedEdge e) {
        //需要让边e出现在起点邻接表中
        int v = e.from();
        adj[v].enqueue(e);

        //边的数量+1
        E++;
    }

    //获取和顶点v关联的所有边
    public Queue<DirectedEdge> adj(int v) {
        return adj[v];
    }

    //获取加权无向图的所有边
    public Queue<DirectedEdge> edges() {

        //创建一个队列对象，存储所有的边
        Queue<DirectedEdge> allEdges = new Queue<>();
        for (int v = 0;v<V;v++){
            for (DirectedEdge edge : adj[v]) {
                allEdges.enqueue(edge);

            }
        }return allEdges;

    }
}
