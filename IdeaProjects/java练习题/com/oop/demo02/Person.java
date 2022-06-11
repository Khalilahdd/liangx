package com.oop.demo02;

public class Person {

    //一个类即使什么都不写，也会存在一个方法
    //显示的定义构造器
    String name;

    //实例化初始值
    //1.使用new关键字，必须要要构造器(本质是在调用构造器)
    public Person(){
       // this.name = "老马";
    }

    //有参构造：一旦定义了有参构造，无参就必须显示定义
    public Person(String name){
        this.name = name;
    }
    //alt + insert
}


/*
*    public static void main(String[] args) {

        //new 实例化了一个对象
        Person person = new Person("laomao");

        System.out.println(person.name);
    }

    * 构造器：
    * 1.和类名相同
    * 2.没有返回值
    * 作用：
    * 1.new 本质在调用构造方法
    * 2.初始化对象的值
    * 注意点：
    * 1.定义有参构造之后，如果想使用无参构造，显示的 定义一个无参的构造

}*/