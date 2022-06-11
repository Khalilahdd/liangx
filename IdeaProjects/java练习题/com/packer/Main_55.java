package com.packer;

import java.time.LocalDateTime;

public class Main_55 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2019,10,26,20,30,59);
        System.out.println(dt);
        //日期变为31日：
        LocalDateTime dt2 = dt.withDayOfMonth(31);
        System.out.println(dt2);
        //月份变为9:
        LocalDateTime dt3 = dt2.withMonth(9);
        System.out.println(dt3);
    }
}
