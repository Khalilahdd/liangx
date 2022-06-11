package com.packer;

import java.util.TimeZone;

public class Main_51 {
    public static void main(String[] args) {
        TimeZone tzDefault = TimeZone.getDefault();//当前时区
        TimeZone tzGMT9 = TimeZone.getTimeZone("GMT+09:00");//GMT+9:00时区
        TimeZone tzNY = TimeZone.getTimeZone("America/New_York");//纽约时区
        System.out.println(tzDefault.getID());
        System.out.println(tzGMT9.getID());
        System.out.println(tzNY.getID());
    }
}
