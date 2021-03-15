package algorithm.linear;

import java.util.Iterator;

public class Queue<T> implements Iterable{

    private Queue.Node head;
    private  int N;
    private  Node last;

    @Override
    public Iterator iterator() {
        return new QIterator();
    }
    private class QIterator implements Iterator{
        private Node n;
        public QIterator(){
            this.n =head;
        }


        @Override
        public boolean hasNext() {
            return n.next!= null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }

    private class Node{

        public  T item;
        public Queue.Node next;

        public  Node(T item, Node next){
            this.item =item;
            this.next =next;
        }
    }

    public Queue(){
        this.head = new Node(null,null);
        this.N = 0;
        this.last = null;
    }
    //判断当前栈是否为空
    public boolean isEmpty(){
        return N==0;

    }
    //获取元素个数
    public int size(){
        return N;
    }
    //队列插入元素
    public void enqueue(T t){
        if (last==null){
            last =new Node(t,null);
            head.next =last;

        }else{
            Node oldlast = last;
            last = new Node(t,null);
            oldlast.next =last;
        }
        N++;




    }
    public  T dequeue(){
        if (isEmpty()){return null;}
        Node oldfirst = head.next;
        head.next =oldfirst.next;
        N--;
        if(isEmpty()){
            last = null;
        }
        return oldfirst.item;

        }
}
