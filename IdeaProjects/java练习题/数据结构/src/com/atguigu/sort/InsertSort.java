package com.atguigu.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

//插入排序
public class InsertSort {

    public static void main(String[] args) {

        //int[] arr = {101,34,119,1,-1,90};

        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int)(Math.random() * 8000000);//生成一个[0,80000)数
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = simpleDateFormat.format(date);

        System.out.println("排序前的时间是 = " + dateStr);

        insertSort(arr);

        Date date1 = new Date();
        String format = simpleDateFormat.format(date1);
        System.out.println("排序后的时间是 = " + format);
        //System.out.println(System.currentTimeMillis());
    }

    //插入排序
    public static void insertSort(int[] arr) {


        //使用for循环，代码简化
        for (int i = 1; i < arr.length; i++) {

            //定义待插入的数
            int insertVal = arr[i];
            int insertIndex = i - 1;//即arr[1]的前面这个数的下标

            //给insertVal 找到插入的位置
            //说明：
            //1.insertIndex >= 0 保证在给insertVal 找插入位置，不越界
            //2.insertVal < arr[insertIndex] 待插入的数，还没有找到插入的位置
            //3.就需要将arr[insertIndex]后移
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];//arr[insertIndex]后移
                insertIndex--;
            }
            //当退出while循环，说明插入的位置找到，insertIndex + 1；

            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }

//            System.out.println("第" + i +"轮插入");
//            System.out.println(Arrays.toString(arr));

        }











//
//        //使用逐步推导的方式来讲解，便于理解
//        //第一轮{101,34,119,1} => {34,101,110,1}
//
//        //定义待插入的数
//        int insertVal = arr[1];
//        int insertIndex = 1 - 1;//即arr[1]的前面这个数的下标
//
//        //给insertVal 找到插入的位置
//        //说明：
//        //1.insertIndex >= 0 保证在给insertVal 找插入位置，不越界
//        //2.insertVal < arr[insertIndex] 待插入的数，还没有找到插入的位置
//        //3.就需要将arr[insertIndex]后移
//        while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
//            arr[insertIndex + 1] = arr[insertIndex];//arr[insertIndex]后移
//            insertIndex--;
//        }
//        //当退出while循环，说明插入的位置找到，insertIndex + 1；
//
//        arr[insertIndex + 1] = insertVal;
//
//        System.out.println("第一轮插入");
//        System.out.println(Arrays.toString(arr));
//
//        //定义待插入的数
//        insertVal = arr[2];
//        insertIndex = 2 - 1;//即arr[1]的前面这个数的下标
//
//        //给insertVal 找到插入的位置
//        //说明：
//        //1.insertIndex >= 0 保证在给insertVal 找插入位置，不越界
//        //2.insertVal < arr[insertIndex] 待插入的数，还没有找到插入的位置
//        //3.就需要将arr[insertIndex]后移
//        while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
//            arr[insertIndex + 1] = arr[insertIndex];//arr[insertIndex]后移
//            insertIndex--;
//        }
//        //当退出while循环，说明插入的位置找到，insertIndex + 1；
//
//        arr[insertIndex + 1] = insertVal;
//
//        System.out.println("第二轮插入");
//        System.out.println(Arrays.toString(arr));
//
//        //定义待插入的数
//        insertVal = arr[3];
//        insertIndex = 3 - 1;//即arr[1]的前面这个数的下标
//
//        //给insertVal 找到插入的位置
//        //说明：
//        //1.insertIndex >= 0 保证在给insertVal 找插入位置，不越界
//        //2.insertVal < arr[insertIndex] 待插入的数，还没有找到插入的位置
//        //3.就需要将arr[insertIndex]后移
//        while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
//            arr[insertIndex + 1] = arr[insertIndex];//arr[insertIndex]后移
//            insertIndex--;
//        }
//        //当退出while循环，说明插入的位置找到，insertIndex + 1；
//
//        arr[insertIndex + 1] = insertVal;
//
//        System.out.println("第三轮插入");
//        System.out.println(Arrays.toString(arr));
    }
}
