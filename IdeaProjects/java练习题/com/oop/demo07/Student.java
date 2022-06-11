package com.oop.demo07;

public class Student {

    private static int age;//静态的变量
    private double score;//非静态的变量

    public void run(){

    }

    public static void go(){

    }
    public static void main(String[] args) {
        Student s1 = new Student();

        go();//main函数也是静态的，所以静态可以直接调用静态的方法
        //run();//main函数直接调用非静态的方法会报错
    }
}
