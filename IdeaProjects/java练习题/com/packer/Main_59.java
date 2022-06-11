package com.packer;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**要创建一个ZonedDateTime对象，有以下几种方法，一种是通过now()方法返回当前时间：
 * 另一种方式是通过给一个LocalDateTime附加一个ZoneId，就可以变成ZonedDateTime：
  */
/*public class Main_59 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();//默认时区
        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));//用指定时区获取当前时区
        System.out.println(zbj);
        System.out.println(zny);
    }
}*/
    public class Main_59{
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2019,9,15,15,16,17);
        ZonedDateTime zbj = ldt.atZone(ZoneId.systemDefault());
        ZonedDateTime zny = ldt.atZone(ZoneId.of("America/New_York"));
        System.out.println(zbj);
        System.out.println(zny);
    }
}
