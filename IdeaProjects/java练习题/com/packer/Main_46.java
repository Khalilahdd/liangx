package com.packer;

import java.util.Date;

public class Main_46 {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data.getYear() + 1900);
        System.out.println(data.getMonth() + 1);
        System.out.println(data.getDate());
        //转换String
        System.out.println(data.toString());
        //转换为GMT时区：
        System.out.println(data.toGMTString());
        //转换为本地时区：
        System.out.println(data.toLocaleString());
    }
}
