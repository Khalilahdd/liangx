package com.Array;

import java.util.Arrays;

public class ArrayDemo7 {
    public static void main(String[] args) {
            int[] a = {1,4,3,46,87,43,9,7,56,895};
            //调用自己写的排序函数,返回一个排序完的数组
            int[] sort = sort(a);
        System.out.println(Arrays.toString(a));
    }
    //冒泡排序
    //1.比较数组中，两个相邻的元素，如果第一个数比第二个大，我们就交换它们的位置
    //2.每一次比较，都会产生一个最大，或者最小
    //3.下一轮则可以少一次排序
    //4.依次循环，直到结束！
    public static int[] sort(int[] array){
        int temp = 0;
        //外层循环，判断我们这个要走多少次；
        for (int i = 0; i < array.length - 1; i++) {
            //通过flag标识减少没有意义的比较
            boolean flag = false;
            //内层循环，比较判断两个数，如果第一个数比第二个数大，则交换位置
            for(int j = 0;j < array.length - 1 -i;j++){
                if(array[j+1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
            return array;
    }
}
