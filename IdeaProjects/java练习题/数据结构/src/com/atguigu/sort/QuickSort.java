package com.atguigu.sort;

import java.util.Arrays;

//快速排序
public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {-9,78,0,23,-567,70};

        quickSort(arr,0,arr.length - 1);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int left,int right) {
        int l = left;//左下标
        int r = right;//右下标
        //pivot 中轴
        int pivot = arr[(left + right) / 2];
        int temp = 0;//临时变量，作为交换时使用
        //while循环的目的是让比pivot值小的放到左边，比pivot值大的放到右边
        while (l < r) {
            //在pivot的左边于一直找，找到大等于pivot值，才退出
            while (arr[l] < pivot) {
                l += 1;
            }
            //在pivot的左边一直找，找到小于等于pivot值，才退出
            while (arr[r] > pivot) {
                r -= 1;
            }
            //如果l >= r 说明pivot的左右两的值，已经按照左边全部是
            //小于等于pivot值，右边全部是大于等于pivot的值
            if (l >= r) {
                break;
            }

            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //如果交换完后，发现这个arr[l] == pivot值相等r--，前移
            if (arr[l] == pivot) {
                r -= 1;
            }
            //如果交换完后，发现这个arr[r] == pivot值相等l++，后移
            if (arr[r] == pivot) {
                l += 1;
            }

            //如果l==r，必须l++，r--，否则会出现栈溢出
            if (l == r) {
                l += 1;
                r -= 1;
            }

            if (left < r) {  //向左递归
                quickSort(arr,left,r);
            } else if (right > l) { //向右递归
                quickSort(arr,l,right);
            }
        }
    }
}
