package com.lianxi;

import java.util.Scanner;

public class day {

    public static void main(String[] args) {
        //自定义输入语句
        Scanner Dayscan = new Scanner(System.in);
        //输入年月日
        int year = Integer.parseInt(Dayscan.next());
        int month = Integer.parseInt(Dayscan.next());
        int day = Integer.parseInt(Dayscan.next());
        System.out.println(year + "年" + month + "月" + day + "日");
        //得出整年天数
        int days = (year - 1999) * 365;
        //判断是否是闰年
        for (int i = 1999; i < year; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                //如果是天数加1
                days++;
            }
        }
        //月份天数
        for (int i = 1; i <= month; i++) {
            if (i == 2) {
                days += 28;
                //判断是否是闰月
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) days++;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                days += 30;
            } else {
                days += 31;
            }
        }
        //总的天数
        days += day;
        System.out.println(days);
        if (days % 5 == 1 || days % 5 == 2 || days % 5 == 3) {
            System.out.println("这一天此人在打鱼");
        } else {
            System.out.println("这一天此人在晒网");
        }
        Dayscan.close();
    }
}
