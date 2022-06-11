package com.API.demo02.Date;

/*
    java.util.Date表示日期和时间的类
    类 Date 表示特定的瞬间，精确到毫秒
    毫秒：千分之一 1000毫秒 = 1秒
    特点的瞬间：一个时间点，一刹那时间
    2099-09-09 09:33:33:444 瞬间
    ...
    毫秒值的作用，可以对时间和日期进行计算
    2009-01-10 到 2054-02-14 中间一共有多少天
    可以将日期转换为毫秒进行计算 ，计算完毕，在把毫秒值转换为日期

    把日期转换为毫秒：
        当前的日期：2009-01-10
        时间原点（0毫秒）：1970年1月1日 00:00：00
        就是计算当前日期到时间原点之间一共经历了多少毫秒  1611285318684
    注意：
        中国属于东八区，会把时间增加8个小时
        1970年1月1日 00:00:00

    把毫秒转换为日期：
        1天 = 24 * 60 * 60 = 86400 秒 = 86400 * 1000 = 86400000毫秒
 */
public class Demo01Date {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统时间到1970-01-01 00:00:00一共经历了多少毫秒
    }
}
