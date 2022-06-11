package com.Thread.heima.Lock;


/*
    模拟卖票案例
        创建三个线程，同时开启，对共享的票进行出售
 */
public class Demo01Ticker {

    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImp1 run = new RunnableImp1();
        //System.out.println("run" + run);
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run,"老张");
        Thread t1 = new Thread(run,"老李");
        Thread t2 = new Thread(run,"老叶");
        //调用start方法开启多线程
        t0.start();
        t1.start();
        t2.start();
    }
}
