package com.Thread.heima.Synchronized1;

/*
        卖票案例出现了线程安全问题
        卖出了不存在的票和重复的票

        解决线程安全问题的第二种方法：使用同步方法
        使用步骤：
            1.把访问了共享数据的代码抽取出来，放到一个方法中
            2.在方法上添加synchronized修饰符

        格式：定义方法的格式
            修饰符 synchronized 返回值类型 方法名(参数列表) {
                    可能出现线程安全问题的代码(访问了共享数据的代码)
            }
 */
public class RunnableImp1 implements Runnable{
    //定义一个多个线程共享的票源
    private static int ticker = 100;

    //设置线程任务：卖票
    @Override
    public void run() {

        //System.out.println("this" + this);
        //使用死循环，让卖票操作重复执行
        while (true) {
            payTicketStatic();
        }
    }

    /*
        静态同步方法：
            锁对象是谁？
            不能是this
            this是创建对象之后产生的，静态方法优先于对象
            静态方法的锁对象是本类的class属性-->class文件对象(反射)
     */
    public static /*synchronized*/ void payTicketStatic() {
        synchronized (Runnable.class){
            //先判断票是否存在
            if (ticker > 0) {
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //票存在，卖票 ticket--
                System.out.println(Thread.currentThread().getName() + "-->正在卖" + ticker + "张票");
                ticker--;
            }
        }
    }
    /*
        定义一个同步方法：
            同步方法也会把方法内部的代码锁住
            只让一个线程执行
            同步方法的锁对象是谁？
            就是实现类对象 new RunnableImp1()
            也就是this
     */
//    public synchronized void payTicket() {
//        //先判断票是否存在
//        if (ticker > 0) {
//
//            //提高安全问题出现的概率，让程序睡眠
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            //票存在，卖票 ticket--
//            System.out.println(Thread.currentThread().getName() + "-->正在卖票" + ticker + "张票");
//            ticker--;
//        }
//    }
}
