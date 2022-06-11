package com.itheima.demo06.Set;

import java.util.HashSet;

/*
    HashSet存储自定义类型元素

    set集合报错元素唯一：
        存储的元素（String，Integer，.....Student，Person....），必须重写hashCode方法和equals方法

    要求：
        同名同年龄的人，视为同一个人，只能存储一次
 */
public class Demo03HashSetSavePerson {

    public static void main(String[] args) {
        //创建一个HashSet集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("迪丽热巴",18);
        Person p3 = new Person("迪丽热巴",19);
        System.out.println(p1.hashCode());//189568618
        System.out.println(p2.hashCode());//793589513
        System.out.println(p3.hashCode());//1313922862

        System.out.println(p1 == p2);//false
        System.out.println(p1.equals(p2));//false   //true

        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);//[Person{name='迪丽热巴', age=18}, Person{name='迪丽热巴', age=18}, Person{name='迪丽热巴', age=19}]
    }
}
