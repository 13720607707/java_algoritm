package algorithm.linear;

import java.awt.font.TextHitInfo;
import java.util.Iterator;
import java.util.function.Consumer;

public class SequenceList<T> implements Iterable<T> {
    //存储元素数组
    private T[] eles;
    //记录当前顺序表中的元素个数
    private int N;

    //构造方法
    public SequenceList(int capacity) {
        this.eles = (T[]) new Object[capacity];
        this.N = 0;

    }

    //将一个线性表置为空表
    public void clear() {
        this.N = 0;
    }

    //判断是否为空表
    public boolean isEmpty() {
        return N == 0;
    }

    //获取线性表长度
    public int length() {
        return N;
    }

    //获取指定元素的位置
    public T get(int i) {
        return eles[i];
    }


    //向线性表中添加元素
    public void insert(T t) {
        if (N==eles.length){
            resize(2*eles.length);
        }
        eles[N++] = t;

    }

    //往指定位置i中添加元素
    public void insert(int i, T t) {

        for (int index = N; index > i; index--) {
            eles[index] = eles[index - 1];
        }
        eles[i] = t;

        N++;

    }

    //删除i处元素

    public T remove(int i) {
        //记录索引i处值
        T current = eles[i];
        //后续元素向前移一位

        for (int index = i; index < N - 1; index++) {
            eles[index] = eles[index + 1];
        }
        //元素个数减一
        N--;

        if (N<eles.length/4){
            resize(eles.length/2);
        }
        return current;
    }
    //查找t元素第一次出现的位置

    public int indexOf(T t) {
        for (int i = 0; i < N; i++) {
            if (eles[i].equals(t)) {
                return i;
            }

        }
        return -1;
    }

    //根据newsize,重置eles大小
    public void resize(int newSize){
        T[] temp =eles;
        //创建新数组
        eles=(T[])new Object[newSize];
        for (int i = 0;i<N;i++){
            eles[i]=temp[i];
        }
    }





    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator {
        private int cusor;
        public SIterator(){
            this.cusor=0;
        }

        @Override
        public boolean hasNext() {
            return cusor<N;
        }


        @Override
        public Object next() {
            return eles[cusor++];
        }
    }

}
