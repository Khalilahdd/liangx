package com.method;
//方法重载的规则：
/**
 * 方法名称必须相同
 * 参数列表必须不同（个数不同、或类型不同、参数排列顺序不同等）
 * 方法的返回类型可以相同也可以不同
 * 仅仅返回类型不同不足以成为方法的重载
 */
public class Demo1 {
    public static void main(String[] args) {
        int sum = add(10,20,30);
        System.out.println(sum);
    }
    //加法
    //形式参数，用来定义作用的
    public static int add(int num1,int num2){
        return num1 + num2;
    }
    public static int add(int num1,int num2,int num3){
        return num1 + num2 + num3;
    }
}
