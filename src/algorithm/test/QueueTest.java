package algorithm.test;

import algorithm.linear.Queue;

public class QueueTest {
    public static void main(String[] args) {
        //创建队列对象
        Queue<String> q =new Queue<>();
        //测试队列方法
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");

        for (Object o : q) {
            System.out.println(o);
        }

        String result =q.dequeue();
        System.out.println(result);
        System.out.println(q.size());
      
    }
}
