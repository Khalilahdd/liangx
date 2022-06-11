package com.API.demo02.Date;


import java.util.Date;

public class Demo02Date {

    public static void main(String[] args) {
        demo01();
        deme02();
        demo03();
    }

    /*
    long getTime() 把日期转换为毫秒值(System.currentTimeMillis()方法)
    返回自 1970年1月1日 00:00:00 GMT 以来此 Date 对象表示的毫秒值。
     */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    /*
    Date类的带参数构造方法
    Date(long date)：传递毫秒值，把毫秒值转换为Date日期
     */
    private static void deme02() {
        Date date = new Date(0L);
        System.out.println(date);//Fri Jan 22 11:14:05 CST 2021

        date = new Date(1611285310);
        System.out.println(date);
    }

    /*
    Date 类的空参数构造方法
    Date()获取当前系统的日期和时间
     */
    private static void demo01(){
        Date date = new Date();
        System.out.println(date);//Fri Jan 22 11:11:26 CST 2021
    }
}
