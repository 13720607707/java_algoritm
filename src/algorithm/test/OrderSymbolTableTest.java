package algorithm.test;

import algorithm.symbol.OrderSymbolTable;



public class OrderSymbolTableTest {
    public static void main(String[] args) {
        //创建有序符号表对象
        var a =new OrderSymbolTable<Integer,String>();
        a.put(1,"张三");
        a.put(2,"李四");
        a.put(3,"王五");
        a.put(6,"天气");


        a.put(4,"test");

    }
}
