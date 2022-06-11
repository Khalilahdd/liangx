package com.packer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main_53 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();//当前日期
        LocalTime t = LocalTime.now();//当前时间
        LocalDateTime dt = LocalDateTime.now();//当前日期和时间
        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);
    }
}
