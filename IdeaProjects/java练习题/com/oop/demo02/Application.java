package com.oop.demo02;

import com.oop.demo02.Person;

//一个项目一个只有一个main方法
public class Application {
    public static void main(String[] args) {

        //new 实例化了一个对象
        Person person = new Person("laomao");

        System.out.println(person.name);
    }
}