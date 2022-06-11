package com.packer;
/**使用LocalDateTime可以非常方便地对日期和时间进行加减，或者调整日期和时间，它总是返回新对象；

 使用isBefore()和isAfter()可以判断日期和时间的先后；

 使用Duration和Period可以表示两个日期和时间的“区间间隔”。*/
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main_58 {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2019,11,19,8,15,0);
        LocalDateTime end = LocalDateTime.of(2020,1,9,19,25,30);
        Duration d = Duration.between(start,end);
        System.out.println(d);
        Period p = LocalDate.of(2019,11,19).until(LocalDate.of(2020,1,9));
        System.out.println(p);
    }
}
