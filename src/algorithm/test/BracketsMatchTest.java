package algorithm.test;

import java.util.Stack;
//检测括号匹配
public class BracketsMatchTest {
    public static void main(String[] args) {
        String str = "(上海)长安";
        boolean match =isMatch(str);
        System.out.println(str + "中的括号是否匹配"+match);


    }


    public  static boolean isMatch(String str){
        //创建栈对象，用来存储左括号
        Stack<String> chars = new Stack<>();
        //从做往右遍历字符串
        for (int i = 0; i < str.length(); i++) {
            String c = str.charAt(i)+"";
            //左括号入栈
            if (c.equals("(")){
                chars.push(c);
            }
            //如果是右括号，弹出一个左括号
            if (c.equals(")")){
                String pop =chars.pop();
                //判断是否有剩余左括号
                if(pop==null){
                    return false;
                }
            }

            }
        if (chars.size() !=0)
               {return false;}
        return true;






    }
}


