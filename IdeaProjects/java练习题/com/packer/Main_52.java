//package com.packer;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.TimeZone;
//
//public class Main_52 {
//    public static void main(String[] args) {
//        //当前时间：
//        Calendar c = Calendar.getInstance();
//        //清除所有：
//        c.clear();
//        //设置北京时区：
//        c.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
//        //设置年月日时分秒：
//        c.set(2019,10 /* 11月 */,20,8,15,0);
//        //显示时间：
//        var sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
//        System.out.println(sdf.format(c.getTime()));
//    }
//}
