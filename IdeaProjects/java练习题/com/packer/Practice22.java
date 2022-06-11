package com.packer;


import java.time.*;

public class Practice22 {
    public static void main(String[] args) {
        LocalDateTime departureBeijing = LocalDateTime.of(2019,9,15,13,0,0);
        int hours = 13;
        int minutes = 20;
        LocalDateTime arrivalAtNewYork = calculateArrivalAtNY(departureBeijing,hours,minutes);
        System.out.println(departureBeijing + "->" + arrivalAtNewYork);
        //test:
        if(!LocalDateTime.of(2019,10,15,14,20,0)
                .equals(calculateArrivalAtNY(LocalDateTime.of(2019,10,15,13,0,0),13,20))) {
            System.out.println("测试失败！");
        }else if(!LocalDateTime.of(2019,11,15,13,20,0)
                .equals(calculateArrivalAtNY(LocalDateTime.of(2019,11,15,13,0,0),13,20))) {
            System.out.println("测试失败！");
        }
    }
    static LocalDateTime calculateArrivalAtNY(LocalDateTime bj,int h,int m) {
        return bj.atZone(ZoneId.of("Asis/Shanghai")).withZoneSameInstant(ZoneId.of("America/New_York")).
                plusHours(h).plusMinutes(m).toLocalDateTime();
    }
}
