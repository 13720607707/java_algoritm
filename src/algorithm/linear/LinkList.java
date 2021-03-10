package algorithm.linear;


import java.net.PortUnreachableException;
import java.util.Iterator;

public class LinkList<T> implements Iterable<T>{
    //记录头结点
    private Node head;
    //记录链表的长度
    private int N;
    //结点类

    private class Node {
        //存储数据
        T item;
        //下一个节点

        Node next;

        public Node(T item,Node next) {
            this.item = item;
            this.next = next;
        }
    }



    public LinkList(){

        //初始化头结点
        this.head = new Node(null,null);
        //初始化元素个数
        this.N=0;
    }

    public void clear(){
        head.next = null;
        this.N =0;
    }
    public boolean isEmpty(){
        return N==0;
    }
//获取指定位置i元素
    public T get(int i){
        //通过循环，从头结点开始往后找，依次找i次，就可以找到对应的元素
        Node n=head.next;
        for (int index=0;index<i;index++){
            n=n.next;
        }
        return n.item;
    }
    public void insert(T t){
        Node n= head;
        while (n.next!=null){
            n=n.next;
        }
        Node newNode =new Node(t,null);
        n.next=newNode;
        N++;

    }
    public void insert(int i,T t){
        //找到i位置前一节点
        Node pre =head;
        for(int index=0;index<i-1;index++){
            pre =pre.next;
        }
        //找到i位置的节点
        Node curr =pre.next;

        //创建新节点，并且新节点需要指向原来i位置节点
        Node newNode = new Node(t,curr);
        //原来i位置的前一个节点指向新节点
        pre.next=newNode;
        N++;
    }
    public T remove(int i){
        //找到i位置前一个节点
        Node pre =head;
        for(int index=0;index<i-1;i++){
            pre =pre.next;
        }
        //找到i位置节点
        Node curr =pre.next;
        //找到i位置下一个节点
        Node nextNode =curr.next;
        //前一个节点指向下一个节点
        pre.next =nextNode;
        //元素个数减一
        N--;
        return curr.item;

    }
    //查找元素t在链表中第一次出现的位置

    public int indexOf(T t){
        //从头结点开始，依次找到每一个节点，取出item，和t比较，如果相同，就找到
        Node n =head;
        for(int i=0;n.next!=null;i++){
            n=n.next;
            if (n.item.equals(t)){
                return i;
            }


        }
        return -1;
    }

    public int length() {
        return N;
    }

    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }
    private class TIterator implements Iterator{
        private Node n;
        public TIterator(){
            this.n=head;
        }
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }
    }
    //反转整个链表
    public void reverse(){
        if (isEmpty()){
            return;
        }
        reverse(head.next);

    }
    //反转指定的节点curr，并把反转后的节点返回
    public  Node reverse(Node curr){

        if (curr.next ==null){head.next =curr;
        return curr;


        }
        //递归的反转当前节点curr的下一个节点；返回值就是链表反转后当前节点上一个节点
        Node pre =reverse(curr.next);
        //让返回的节点的下一个节点变为当前节点的cuur
        pre.next =curr;
        //把当前节点的下一个节点变为null
        curr.next =null;
        return  curr;

    }


}
