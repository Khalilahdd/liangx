package com.lianxi;

public class Thread1 {
    public static void main(String[] args) {
        //创建线程1、2
        MyRunnable1 myThread1 = new MyRunnable1();
        MyRunnable2 myThread2 = new MyRunnable2();
        //启动线程
        new Thread(myThread1 ,"线程偶数：").start();
        new Thread(myThread2 ,"线程奇数：").start();
    }
}
//偶数
class MyRunnable1 implements Runnable{

    //重写run方法，也就是线程运行体
    @Override
    public synchronized void  run() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0){
                //try...catch判断是否异常
                try {
                    //休眠
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //currentThread()方法是在Thread类的静态方法，可以返回当前正在执行的线程对象的引用
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
        System.out.println(Thread.currentThread().getName()+"end");
    }
}
//奇数
class MyRunnable2 implements Runnable{
    //重写run方法，也就是线程运行体
    @Override
    public synchronized void run() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //currentThread()方法是在Thread类的静态方法，可以返回当前正在执行的线程对象的引用
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
        System.out.println(Thread.currentThread().getName()+"end");
    }
}