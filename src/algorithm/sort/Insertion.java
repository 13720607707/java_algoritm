package algorithm.sort;

public class Insertion {

    public static void sort(Comparable[] a){
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                //比较索引j处的值和j-1处的值，如果索引j-1处的值比j处值大则交换数据

                if(greater(a[j-1],a[j])){
                    exch(a,j-1,j);

                }else{break;

                }
            }

        }




    }


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
