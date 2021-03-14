package algorithm.test;

import algorithm.linear.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack =new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");


        for (String item: stack){
            System.out.println(item); }

        String result = stack.pop();
        System.out.println("弹出元素是:"+result);
        System.out.println("剩余个数："+stack.size());
    }
}
