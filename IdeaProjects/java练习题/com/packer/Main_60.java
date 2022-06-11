//package com.packer;
//
//import java.time.ZonedDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Locale;
//
//public class Main_60 {
//    public static void main(String[] args) {
//        ZonedDateTime zdt = ZonedDateTime.now();
//        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm ZZZZ");
//        System.out.println(formatter.format(zdt));
//        var zhFormatter = DateTimeFormatter.ofPattern("yyyy MM dd EE HH:mm",Locale.CHINA);
//        System.out.println(zhFormatter.format(zdt));
//        var usFormatter = DateTimeFormatter.ofPattern("E MMM/dd/yyyy HH:mm",Locale.US);
//        System.out.println(usFormatter.format(zdt));
//    }
//}
