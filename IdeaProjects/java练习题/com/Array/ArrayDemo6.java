package com.Array;

import java.util.Arrays;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,900,31321,543,21,33};
        System.out.println(a);//输出一个对象

        //对数组进行排序Array.sort
        Arrays.sort(a);
        //打印数组元素Array.tostring
        System.out.println(Arrays.toString(a));
        //数组填充
        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));
    }

}
