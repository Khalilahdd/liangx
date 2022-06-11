package com.Thread.kuangshen.syn;

//不安全的买票
//线程不安全，有负数
public class UnsafeBuyTicket {

    public static void main(String[] args) {
        BuyTicker buyTicker = new BuyTicker();


        new Thread(buyTicker,"苦逼的我").start();
        new Thread(buyTicker,"牛逼的你们").start();
        new Thread(buyTicker,"可恶的黄牛党").start();
    }
}


class BuyTicker implements Runnable{

    //票
    private int ticketNums = 10;
    boolean flag = true;//外部停止方式

    @Override
    public void run() {
        //买票
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //synchronized 同步方法，锁的是this
    private synchronized void buy() throws InterruptedException {
        //判断是否有票
        if (ticketNums <= 0) {

            flag = false;
            return;
        }
        //模拟延时
        Thread.sleep(100);

        //买票
        System.out.println(Thread.currentThread().getName() + "拿到" + ticketNums--);
    }
}