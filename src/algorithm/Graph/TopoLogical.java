package algorithm.Graph;

import algorithm.linear.Stack;

public class TopoLogical {
    //顶点的拓扑排序
    private Stack<Integer> order;

    //构造拓扑排序对象
    public TopoLogical(Digraph G) {
       DirectedCycle C =new DirectedCycle(G);
       if(!C.hasCycle()){
          DepthFirstOrder D = new DepthFirstOrder(G);
          order = D.reversePost();
       }

    }

    //判断图G是否有环
    private boolean isCycle(){
        return order==null;
    }

    //获取拓扑排序的所有顶点
    public Stack<Integer>  order(){
        return order;
    }
}
