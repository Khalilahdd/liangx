package com.packer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main_54 {
    public static void main(String[] args) {
        //自定义格式化：
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));
        //自定义格式解析：
        CharSequence text;
        LocalDateTime dt2 = LocalDateTime.parse("2019/11/30 15:16:17", dtf);
        System.out.println(dt2);
    }
}
