package com.API.demo01.Objects;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    java.long.Object类
    类 Object 是类层次结构的根（最顶层）类，每个类都使用 Object 作为超（父）类
    所以对象（包括数组）都实现这个类的方法
 */
public class Demo01toString {

    public static void main(String[] args) {
    /*
    Person类默认继承Object类，所以可以使用Object类中的toString方法
    String toString() 返回对象的字符串表示。
      */
    Person p = new Person("张三",12);
    String s = p.toString();
        System.out.println(s);//com.API.demo01.Person@b4c966a/Person{name='张三', age=12}

        //直接打印对象的名字，其实就是调用对象的toString方法 p = p.toString()；
        System.out.println(p);//com.API.demo01.Person@b4c966a/Person{name='张三', age=12}

        /*
        看一个类是否重写了toString方法，直接打印这个类对应对象的名字即可
            如果没有重写toString方法，那么打印的就是对象的地址值（默认）
            如果重写了toString方法，那么就按照重写的方法打印
         */
        Random r = new Random();
        System.out.println(r);//java.util.Random@7cd84586n

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
