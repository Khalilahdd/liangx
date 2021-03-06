package com.itheima.demo09.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.util.Collections是集合工具类，用来对集合进行操作，部分方法如下:
        - public static <T> boolean addAll(Collections<T> c,T...elements)：往集合中添加一些元素
        - public static void shuffle(List<?> list) 打乱顺序：打乱集合顺序
 */
public class Demo01Collections {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加多个元素
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");

        //public static <T> boolean addAll(Collections<T> c,T...elements)：往集合中添加一些元素
        Collections.addAll(list,"a","b","c","d","e");

        System.out.println(list);//[a, b, c, d, e]

        //public static void shuffle(List<?> list) 打乱顺序：打乱集合顺序
        Collections.shuffle(list);
        System.out.println(list);//[d, b, e, c, a]
    }
}
