package com.atguigu.tree;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HeapSort {

    public static void main(String[] args) {
        //要求将数组进行升序排序
        //int[] arr = {4, 6, 8, 5, 9, -1, 90, 89, 56, -999};
        //创建要给80000个随机的数组
        int[] arr = new int[8000000];
        for (int i = 0; i < 8000000; i++) {
            arr[i] = (int) (Math.random() * 80000);//生成一个[0,80000)数
        }
        //System.out.println(Arrays.toString(arr));

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = simpleDateFormat.format(date);
        System.out.println("排序前的时间是 = " + dateStr);

        heapSort(arr);

        Date date1 = new Date();
        String format = simpleDateFormat.format(date1);
        System.out.println("排序后的时间是 = " + format);
    }

    //编写一个堆排序的方法
    public static void heapSort(int[] arr) {
        System.out.println("堆排序！！");
        int temp = 0;
        //分步完成
//        adjustHeap(arr,1,arr.length);
//        System.out.println("第一次" + Arrays.toString(arr));
//
//        adjustHeap(arr,0,arr.length);
//        System.out.println("第二次" + Arrays.toString(arr));

        //完成最终的代码
        //将无序序列构建成一个堆，根据升序降序需求选择大顶堆或小顶堆
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        /*
            2.将堆顶元素和末尾元素交换，将最大元素“沉”到数组末端
            3.重新调整结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行调整 + 交换步骤，直到整个序列有序
         */

        for (int j = arr.length - 1; j > 0; j--) {
            //交换
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjustHeap(arr, 0, j);
        }
        //System.out.println("数组 = " + Arrays.toString(arr));
    }

    //将一个数组（二叉树），调整成一个大顶堆

    /**
     * 功能：完成将以i对应的非叶子结点的树调整成大顶堆
     * 举例 int[] arr = {4,6,8,5,9}; => i = 1 => adjustHeap => 得到{4,9,8,5,6}
     * 如果我们再次调用 adjustHeap 传入的是 i = 0 => 得到{4,9,8,5,6} => {9,6,8,5,4}
     *
     * @param arr    待调整的数组
     * @param i      表示非叶子结点在数组中的索引
     * @param length 表示对多少个元素进行调整，length 是在逐渐减少
     */
    public static void adjustHeap(int[] arr, int i, int length) {

        int temp = arr[i];//先取出当前元素的值，保存在临时变量
        //开始调整
        ///说明
        //1.k = i * 2 + 1 k 是i结点的左子结点
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && arr[k] < arr[k + 1]) {//说明左子结点值小于右子结点的值
                k++;//k指向右子结点
            }
            if (arr[k] > temp) {//如果子结点大于父结点
                arr[i] = arr[k];//把较大的值赋给当前结点
                i = k;//！！！i 指向 k，继续循环比较
            } else {
                break;
            }
        }
        //当for循环结束后，我们已经将以i为父结点的树的最大值，放在了最顶上（局部）
        arr[i] = temp;//将temp值放在调整后的位置
    }
}






























