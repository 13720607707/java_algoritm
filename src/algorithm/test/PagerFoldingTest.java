package algorithm.test;

import algorithm.linear.Queue;

public class PagerFoldingTest {
    public static void main(String[] args) {
        //模拟折纸过程产生数
        Node<String> tree =creaeTree(3);
        printTree(tree);

        //遍历树,打印每个节点
    }

    public static Node creaeTree(int N)
    {//定义根节点
        Node<String> root =null;
        for (int i = 0; i < N; i++) {
            //当前第一次对折
            if(i==0){
                root =new Node<>("down",null,null);
                continue;
            }
            //不是第一次对折
            //定义辅助队列,通过层序遍历的思想找到叶子结点,叶子结点添加子节点
            Queue<Node> queue =new Queue<>();
            queue.enqueue(root);
           while (!queue.isEmpty()){
               //从队列弹出一个节点
               Node<String> tmp = queue.dequeue();
               if (tmp.left!=null){
                   queue.enqueue(tmp.left);
               }if (tmp.right!=null){
                   queue.enqueue(tmp.right);
               }
               if(tmp.right==null &&tmp.right==null){
                   tmp.left  = new Node<String>("down",null,null);
                   tmp.right  = new Node<String>("up",null,null);

               }

           }

        }



         return root;

    }
//打印树中每个节点的控制台
    public static void printTree(Node<String> root){
        //中序遍历
        if (root==null){
            return;
        }
        if (root.left!=null){
            printTree(root.left);
        }
        System.out.print(root.item+" ");
        if (root.right!=null){
            printTree(root.right);
        }

    }



    private static class Node<T>{
        public T item;
        public  Node left;
        public Node right;
        public Node(T item, Node left, Node right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }

    }

}
