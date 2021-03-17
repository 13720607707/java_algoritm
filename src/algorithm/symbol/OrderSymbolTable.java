package algorithm.symbol;



//有序符号表
public class OrderSymbolTable<key extends Comparable,value> {
    //记录首节点
    private Node head;
    private int N;
    private class Node{
        public key key;
        public value value;
        public Node next;
        public Node(key key,value value ,Node next){
            this.key =key;
            this.next =next;
            this.value =value;

        }
    }
    public OrderSymbolTable(){
        this.head =new Node(null,null,null);
        this.N = 0;

    }


    public int size() {return N;}
    public void put(key key,value value){
        //定义两个Node变量,分别记录当前节点和上一个节点
        Node curr =head.next;
        Node pre = head;
        while(curr!=null && key.compareTo(curr.key)>0){
            //变换当前节点和前一个节点
            pre =curr;
            curr =curr.next;

        }
        //如果当前节点的curr的键和要插入的key一样,则替换
        if (curr!=null && key.compareTo(curr.key)==0){
            curr.value =value;


        }
        //如果当前节点的curr和要插入的key不一样,则插入

        Node newnode = new Node(key,value,curr);
        pre.next =newnode;
        N++;




    }
    public void delete(key key){
        //找到key节点，把该节点从链表中删除
        Node n =head;
        while (n.next!=null){
            if(n.next.key.equals(key)){
                n.next =n.next.next;
                N--;
                return;
            }
            n =n.next;


        }

    }
    public value get(key key){
        Node n =head;
        while (n.next!=null){
            n =n.next;
            if(n.key.equals(key)){

                return n.value;
            }

        }
        return null;



    }



}

