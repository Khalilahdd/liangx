package com.Thread.heima.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    线程池：JDK1.5之后提供的
    java.util.concurrent.Executors：线程池的工厂类，用来生产线程池
    Executors类中的静态方法：
        static ExecutorService newFixedThreadPool(int nThreads) 创建一个可重用固定线程数的线程池
        参数：
            int nThreads：创建线程池中包含 的线程数量
        返回值：
            ExecutorService接口，返回的是ExecutorService接口的实现类对象，我们可以使用ExecutorService接口接收（面向接口编程）
    java.util.concurrent.ExecutorService：线程池接口
        用来从线程池中获取线程，调用start方法，执行线程任务
        submit(Runnable task) 提交一个可运行的任务执行，并返回一个表示该任务的未来。
        关闭或销毁线程池的方法
        shutdown() 启动有序关闭，其中先前提交的任务将被执行，但不会接受任何新任务。
    线程池的使用步骤：
        1.使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        2.创建一个类，实现Runnable接口，重写run方法，设置线程任务
        3.调用ExecutorService中的方法submit，传递线程任务（实现类），开启线程，执行run方法
        4.调用ExecutorService中的方法shutdown，销毁线程（不建议执行）
 */
public class Demo01ThreadPool {

    public static void main(String[] args) {
        //1.使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        //3.调用ExecutorService中的方法submit，传递线程任务（实现类），开启线程，执行run方法
        executorService.submit(new RunnableImp1());//pool-1-thread-2创建了一个新的线程执行
        executorService.submit(new RunnableImp1());//pool-1-thread-1创建了一个新的线程执行
        //线程池会一直开启，使用完了线程，会自动把线程池归还给线程池，线程可以继续使用
        executorService.submit(new RunnableImp1());//pool-1-thread-2创建了一个新的线程执行

        //4.调用ExecutorService中的方法shutdown，销毁线程（不建议执行）
        //executorService.shutdown();

        //executorService.submit(new RunnableImp1());//抛异常，线程池都没有了，就不能获取线程了
    }
}
