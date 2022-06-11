package com.packer;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main_50 {
    public static void main(String[] args) {
        //当前时间
        Calendar c = Calendar.getInstance();
        //清除所有：
        c.clear();
        //设置2019
        c.set(Calendar.YEAR,2019);
        //设置9月：注意8表示9月：
        c.set(Calendar.MONTH,8);
        //设置2日
        c.set(Calendar.DATE,2);
        //设置时间
        c.set(Calendar.HOUR_OF_DAY,21);//小时
        c.set(Calendar.MINUTE,22);//分钟
        c.set(Calendar.SECOND,23);//秒
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));
    }
}
