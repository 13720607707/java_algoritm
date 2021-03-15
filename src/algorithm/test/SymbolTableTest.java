package algorithm.test;

import algorithm.symbol.SymbolTable;

public class SymbolTableTest {
    public static void main(String[] args) {
        var s = new SymbolTable<Integer,String>();
        s.put(1,"a");
        s.put(2,"b");
        s.put(3,"c");
        System.out.println(s.size());
        System.out.println(s.get(1));

        s.put(2,"d");
        System.out.println(s.size());
        System.out.println(s.get(2));
        s.delete(2);
        System.out.println(s.size());

    }
}
