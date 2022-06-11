package com.atguigu.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

//希尔排序
public class ShellSort {

    public static void main(String[] args) {
        //int[] arr = {8,9,1,7,2,3,5,4,6,0};

        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int)(Math.random() * 8000000);//生成一个[0,80000)数
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = simpleDateFormat.format(date);

        System.out.println("排序前的时间是 = " + dateStr);

        shellSort2(arr);

        Date date1 = new Date();
        String format = simpleDateFormat.format(date1);
        System.out.println("排序后的时间是 = " + format);
    }

    //使用逐步推导的方式来编写希尔排序
    //希尔排序时，对有序列 在插入时采用交换法
    //思路（算法） ===》 代码
    public static void shellSort(int[] arr) {

        int count = 1;
        //根据前面的逐步分析，使用循环处理
        for (int gap = arr.length / 2;gap > 0;gap /= 2) {

            for (int i = gap; i < arr.length; i++) {
                //遍历各组中所以元素（共gap组，每组有个元素）,步长为gap
                for (int j = i - gap; j >= 0; j -= gap) {
                    //如果当前元素大于加上步长的那个元素，说明交换
                    if (arr[j] > arr[j + gap]) {
                        int temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
           //System.out.println("希尔排序第" + count++ + "轮= " + Arrays.toString(arr));
        }

//        //希尔排序的第1轮排序
//        //因为第1轮排序，是将10个数据分成了5组
//        for (int i = 5; i < arr.length; i++) {
//            //遍历各组中所以元素（共5组，每组有2个元素）,步长为5
//            for (int j = i - 5; j >= 0; j -= 5) {
//                //如果当前元素大于加上步长的那个元素，说明交换
//                if (arr[j] > arr[j + 5]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 5];
//                    arr[j + 5] = temp;
//                }
//            }
//        }
//
//        System.out.println("希尔排序1轮后 = " + Arrays.toString(arr));
//
//
//        //希尔排序的第2轮排序
//        //因为第1轮排序，是将10个数据分成了2组
//        for (int i = 2; i < arr.length; i++) {
//            //遍历各组中所以元素（共2组，每组有5个元素）,步长为2
//            for (int j = i - 2; j >= 0; j -= 2) {
//                //如果当前元素大于加上步长的那个元素，说明交换
//                if (arr[j] > arr[j + 2]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 2];
//                    arr[j + 2] = temp;
//                }
//            }
//        }
//
//        System.out.println("希尔排序2轮后 = " + Arrays.toString(arr));
//
//        //希尔排序的第3轮排序
//        //因为第1轮排序，是将10个数据分成了1组
//        for (int i = 1; i < arr.length; i++) {
//            //遍历各组中所以元素（共5组，每组有2个元素）,步长为5
//            for (int j = i - 1; j >= 0; j -= 1) {
//                //如果当前元素大于加上步长的那个元素，说明交换
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println("希尔排序3轮后 = " + Arrays.toString(arr));
    }

    //对交换式的希尔排序进行优化->移位法

    public static void shellSort2(int[] arr) {

        int count = 1;
        //增量gap，并逐步的缩小增量
        for (int gap = arr.length / 2; gap > 0 ; gap /= 2) {
            //从第gap个元素，逐个对其所在的组进行直接插入排序
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        //移动
                        arr[j] = arr[j - gap];
                        j -= gap;
                    } 
                    //当退出while后，就给temp找到插入的位置
                    arr[j] = temp;
                }
            }
            //System.out.println("希尔排序第" + count++ + "轮= " + Arrays.toString(arr));
        }
    }
}
