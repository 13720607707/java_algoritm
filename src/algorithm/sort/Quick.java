package algorithm.sort;

public class Quick {
    //快速排序


        private static boolean less(Comparable v,Comparable w){

            return v.compareTo(w)<0;
        }

        //数组元素i和j交换位置
        private static  void exch(Comparable[] a,int i, int j){
            Comparable t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
        //对组内元素排序
        public static void sort(Comparable[] a){


            //定义一个lo和hi，分别记录数组中最小的索引的最大索引
            int lo = 0;
            int hi = a.length-1;


            sort(a,lo,hi);


        }
        //从数组a中lo到hi的元素进行排序
        public static void sort(Comparable[] a,int lo,int hi){
            if (hi<lo){
                return;
            }
            //对lo到hi之间分组

           int partition = partition(a,lo,hi);//返回的是分组的分界值所在索引，分界值位置变换后的索引
            //左子祖排序
            sort(a,lo,partition-1);
            //右子组排序
            sort(a,partition+1,hi);


        }

        //对数组中，到lo到mid为一组，从mid+1到hi为一组，对这两组进行归并
        private static int partition(Comparable[] a,int lo,int hi){
            //确定分界值
            Comparable key =a[lo];
            int left = lo;
            int right =hi+1;

            while (true){

                while(less(key,a[--right])){
                    if (right==lo){
                        break;
                    }
                }
                while (less(a[++left],key)){
                    if (left == hi){
                        break;
                    }
                }

                if (left>=right){
                    break;
                }else
                {
                    exch(a,left,right);
                }

            }
            exch(a,lo,right);
            return right;


    }

}
