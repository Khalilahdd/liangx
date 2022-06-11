package com.packer;

public class Main_9 {
    public static void main(String[] args) {
        Weekday_1 day = Weekday_1.SUN;
        if(day.dayValue == 6 || day.dayValue == 0){
            System.out.println("Work at home!");
        }else {
            System.out.println("Work at office!");
        }
    }
}
enum Weekday_1 {
    MON(1),TUE(2),WED(3),THU(4),FRI(5),SAT(6),SUN(0);
    public final int dayValue;
    private Weekday_1(int dayValue){
        this.dayValue = dayValue;
    }
}
