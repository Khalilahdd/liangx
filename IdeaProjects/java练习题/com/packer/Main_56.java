package com.packer;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Main_56 {
    public static void main(String[] args) {
        //本月第一天0:00时刻：
        LocalDateTime firstDay = LocalDate.now().withDayOfMonth(1).atStartOfDay();
        System.out.println(firstDay);
        //本月最后一天：
        LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDay);
        //下月第1天：
        LocalDate nextMonthFirstDay = lastDay.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(nextMonthFirstDay);
        //本月第1个周一：
        LocalDate firstWeekday = lastDay.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstWeekday);
    }
}
