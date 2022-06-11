package com.Thread.heima.getName;

/*
    线程的名称:
        主线程：main
        新线程：Thread-0，Thread-1，Thread-3
 */
public class Demo01GetThreadName {

    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt = new MyThread();
        //调用start方法，开启线程，执行run方法
        mt.start();

        new MyThread().start();

        //链式编程
        System.out.println(Thread.currentThread().getName());
    }

}
