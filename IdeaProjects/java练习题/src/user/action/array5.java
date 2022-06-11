package src.user.action;

import java.util.Arrays;
//冒泡排序
public class array5 {
    public static void main(String[] args) {
        int[] ns = {28,12,89,73,65,18,96,50,8,36};
        System.out.print("排序前：\n");
        //Java标准库提供了Arrays.toString()的函数来遍历输出数组
        System.out.println(Arrays.toString(ns));
        //冒泡排序算法的核心
        for(int i = 0;i<ns.length-1;i++)
            for(int j = 0;j < ns.length-1;j++)
            {
                if(ns[j]>ns[j+1])
                {
                    int temp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = temp;
                }
            }
        System.out.print("排序后：\n");
        System.out.println(Arrays.toString(ns));
    }
}
