package com.atguigu.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

//选择排序
public class SelectSort {

    public static void main(String[] args) {

        //int[] arr = {101,34,119,1};

        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int)(Math.random() * 8000000);//生成一个[0,80000)数
        }

        //System.out.println("排序前");
        //System.out.println(Arrays.toString(arr));

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = simpleDateFormat.format(date);
        System.out.println("排序前的时间是 = " + dateStr);


        selectSort(arr);

        //System.out.println("排序后");
        //System.out.println(Arrays.toString(arr));

        Date date1 = new Date();
        String format = simpleDateFormat.format(date1);
        System.out.println("排序后的时间是 = " + format);

    }

    //选择排序
    public static void selectSort(int[] arr) {

        //在推导的过程中，我们发现了规律，因此，可以使用for循环 来解决
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {//说明我们假定的最小值，并不是最小
                    min = arr[j];//重置min
                    minIndex = j;//重置minIndex
                }
            }

            //将最小值，放在arr[0]，即交换
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

//            System.out.println("第"+ (i + 1)+"轮后~~");
//            System.out.println(Arrays.toString(arr));

        }





        //使用逐步推导的方式，来讲解选择排序
        //第一轮
        //原始数组： 101，34,119,1
        //第一轮排序：1,34,119,101
        //算法 先简单--》再复杂，就是可以把一个复杂的算法，拆分成简单的问题--》逐步解决

        //第一轮
//        int minIndex = 0;
//        int min = arr[0];
//        for (int j = 1;j < arr.length;j++) {
//            if (min > arr[j]) {//说明我们假定的最小值，并不是最小
//                min = arr[j];//重置min
//                minIndex = j;//重置minIndex
//            }
//        }
//
//        //将最小值，放在arr[0]，即交换
//        if (minIndex != 0) {
//            arr[minIndex] = arr[0];
//            arr[0] = min;
//        }
//
//
//        System.out.println("第1轮后~~");
//        System.out.println(Arrays.toString(arr));
//
//        //第二轮
//        minIndex = 1;
//        min = arr[1];
//        for (int j = 2;j < arr.length;j++) {
//            if (min > arr[j]) {//说明我们假定的最小值，并不是最小
//                min = arr[j];//重置min
//                minIndex = j;//重置minIndex
//            }
//        }
//
//        //将最小值，放在arr[0]，即交换
//        if (minIndex != 1) {
//            arr[minIndex] = arr[1];
//            arr[1] = min;
//        }
//
//        System.out.println("第2轮后~~");
//        System.out.println(Arrays.toString(arr));
//
//        //第三轮
//        minIndex = 2;
//        min = arr[2];
//        for (int j = 3;j < arr.length;j++) {
//            if (min > arr[j]) {//说明我们假定的最小值，并不是最小
//                min = arr[j];//重置min
//                minIndex = j;//重置minIndex
//            }
//        }
//
//        //将最小值，放在arr[0]，即交换
//        if (minIndex != 2) {
//            arr[minIndex] = arr[2];
//            arr[2] = min;
//        }
//
//        System.out.println("第3轮后~~");
//        System.out.println(Arrays.toString(arr));
    }
}
