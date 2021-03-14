package algorithm.linear;

import java.util.Iterator;

public class Stack<T> implements  Iterable<T>{
    //记录首结点和元素个数
    private Node head;
    private  int N;
     private class Node{
         public  T item;
         public  Node next;

         public  Node(T item,Node next){
             this.item =item;
             this.next =next;
         }
     }

     public Stack(){
         this.head = new Node(null,null);
         this.N = 0;
     }
     //判断当前栈是否为空
    public boolean isEmpty(){
         return N==0;

    }
    //获取栈中元素个数
    public int size(){
         return N;
    }
    //把元素压入栈
    public void push(T t){
         //找到首节点指向的第一个结点
        Node oldFirst =head.next;
        //创建新节点
        Node newNode = new Node(t,null);

        //让首节点指向新节点
        head.next =newNode;
        //让新节点指向原来的第一个结点
        newNode.next = oldFirst;
        N++;




    }
    public  T pop(){
         //找到首节点指向的第一个节点
        Node oldfirst = head.next;
        //让首节点指向原来的节点下一个节点
        if (oldfirst == null){return null;}
        head.next = oldfirst.next;
        N--;
        return oldfirst.item;}


    @Override
    public Iterator<T> iterator() {
        return new STterator();
    }
    private class STterator implements Iterator{
         private Node n;
         public STterator(){
                 this.n=head;}


        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n =n.next;
            return n.item;
        }
    }
}
