package algorithm.symbol;

public class SymbolTable<key,value> {
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
    public SymbolTable(){
        this.head =new Node(null,null,null);
        this.N = 0;

    }


    public int size() {return N;}
    public void put(key key,value value){
        Node n =head ;
        while (n.next!=null){
            n =n.next;
            if(n.key.equals(key)){
                n.value =value;
                return;
            }
        }

        Node newnode =new Node(key,value,null);
        Node oldfirst =head.next;
        head.next =newnode;
        newnode.next =oldfirst;
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

