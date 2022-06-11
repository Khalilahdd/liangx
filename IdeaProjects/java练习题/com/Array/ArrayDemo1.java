package com.Array;

public class ArrayDemo1 {
    //变量的类型     变量的名字  =  变量的值;
    //数组类型
    public static void main(String[] args) {
        int[] nums;//1.定义

        nums = new int[10];//2.在这里可以存储10个int类型变量（创建一个数组）

        //3.给数组元素赋值
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;

        //System.out.println(nums[0]);
        //计算所以元素的和
        int sum = 0;
        //获取数组的长度：arrays.length

        for(int i = 0;i < nums.length;i++){
            sum = sum + nums[i];
        }
        System.out.println("总和为" + sum);
    }
}
