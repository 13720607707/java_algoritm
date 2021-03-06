package algorithm.sort;
//归并排序
public class Merge {
    private static Comparable[] assist;

    private static boolean less(Comparable v,Comparable w){

        return v.compareTo(w)<0;
    }

//数组元素i和j交换位置
    private static  void exch(Comparable[] a,int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
//对数组a进行排序
    public static void sort(Comparable[] a){
        //初始化辅助数组assist
        assist = new Comparable[a.length];

        //定义一个lo和hi，分别记录数组中最小的索引的最大索引
        int lo = 0;
        int hi = a.length-1;

        //调用数组重载方法完成数组a中索引lo到索引hi的排序
       sort(a,lo,hi);


    }
    //从数组a中lo到hi的元素进行排序
    public static void sort(Comparable[] a,int lo,int hi){
        if (hi<lo){
            return;
        }
        //对lo到hi之间分组

        int mid = lo+(hi-lo)/2;
        //分别对每组排序
        sort(a,lo,mid);
        sort(a,mid+1,hi);

        //两组归并
        merge(a,lo,mid,hi);

    }

    //对数组中，到lo到mid为一组，从mid+1到hi为一组，对这两组进行归并
    private static void merge(Comparable[] a,int lo,int mid ,int hi){
        //定义三个指针
        int i=lo;
        int p1=lo;
        int p2=mid+1;
        //遍历，移动p1指p2指针，比较对应索处的值，找到最小的那个，放到辅助索引对应位置
        while(p1<=mid && p2<=hi ){
            if (less(a[p1],a[p2])){
                assist[i++] =a[p1++];
            }else {
                assist[i++]=a[p2++];
            }



        }
        //如果p1/p2的指针没有走完，那么顺序移动p1指针，把对应的元素放到辅助数组的对应索引处
        while (p1<=mid){
            assist[i++]=a[p1++];
        }
        while (p2<=hi){
            assist[i++]=a[p2++];
        }
        //把辅助数组中的元素拷贝到原数组中
        for(int index=lo;index<=hi;index++){
            a[index]=assist[index];
        }

    }


}
