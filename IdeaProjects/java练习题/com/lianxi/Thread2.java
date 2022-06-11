package com.lianxi;

public class Thread2 {
    public static void main(String[] args) {
        //创建三个线程，分别给其命名
        MyThread t1 = new MyThread("Thread-1", (int) (Math.random() * 100));
        MyThread t2 = new MyThread("Thread-2", (int) (Math.random() * 100));
        MyThread t3 = new MyThread("Thread-3", (int) (Math.random() * 100));
        //启动三个线程
        t1.start();
        t2.start();
        t3.start();
    }
}
//MyThread类继承Thread父类
class MyThread extends Thread {
    private String whoAmI;
    private int delay;

    //构造方法
    public MyThread(String s, int d) {
        whoAmI = s;
        delay = d;
    }

    public void run() {
        try {
            sleep(delay);
        } catch (InterruptedException ie) {
        }
        System.out.println("Hello!I am" + whoAmI + ",I slept" + delay + "milliseconds");
    }
}
