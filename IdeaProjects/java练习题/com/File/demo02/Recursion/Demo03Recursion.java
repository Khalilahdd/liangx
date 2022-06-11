package com.File.demo02.Recursion;

/*
    练习：
        使用递归计算阶乘
        n的阶乘：n！ = n * (n-1) * ... * 1
 */
public class Demo03Recursion {

    public static void main(String[] args) {
        int s = sum(5);
        System.out.println(s);
    }

    /*
        定义方法使用递归计算阶乘
        5的阶乘：5! = 5 * 4 * 3 * 2 * 1
        递归结束的条件：
            获取到1的时候结束
        递归的目的：
            获取下一个被乘的数字（n-1）
        方法的参数会发生变化
     */
    public static int sum(int n) {
        //获取1的时候结束
        if (n == 1) {
            return 1;
        }
        //获取下一个被乘的数字（n-1）
        return n * sum(n-1);
    }

}
