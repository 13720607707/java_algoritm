package algorithm.test;

import algorithm.linear.LinkList;
import algorithm.linear.TowWayLinkList;

public class TowWayLinkListTest {
    public static void main(String[] args) {
        //创建双向列表对象
        TowWayLinkList<String> s1 =new TowWayLinkList<>();
        //测试插入
        s1.insert("yao");
        s1.insert("ke");
        s1.insert("mai");
        s1.insert(1,"zhan");

        for (String s :s1){
            System.out.println(s);
        }
        //测试获取
        String getResult = s1.get(1);
        System.out.println("获取索引1处的值为："+getResult);

        //测试删除
        String removeResult = s1.remove(0);
        System.out.println("删除的元素是："+removeResult);

        //测试清空
        s1.clear();
        System.out.println("清空后的线性表中的元素个数为"+s1.length());


        System.out.println(s1.getFirst());
        System.out.println(s1.getLast());

    }
}
