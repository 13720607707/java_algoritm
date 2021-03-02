package algorithm.sort;
//选择排序
public class Selection {

   public static void sort(Comparable[] a){
       for(int i=0;i<=a.length-2;i++){
           //定义一个变量，记录最小元素所在的索引，默认为参与选择排序的第一个元素所在的位置
           int minIndex = i;
           for (int j=i+1;j<a.length;j++){
               if (greater(a[minIndex],a[j])){
                   minIndex=j;
               }
           }
           exch(a,i,minIndex);
       }
   }

//比较v元素是否大于w元素
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }



    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j]= temp;



    }
}
