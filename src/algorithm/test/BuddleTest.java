package algorithm.test;
import algorithm.sort.bubble;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuddleTest {


    public static void main(String[] args) {
        Integer[] arr = {4,5,6,3,2,1};

        bubble.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
