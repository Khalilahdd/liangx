package com.oop.demo06;

public class Person {

    public void run(){
        System.out.println("run");
    }

}



/*
* 多态注意事项：
* 1.多态是方法的多态，属性没有多态
* 2.父类和子类有联系  类型转换异常
* 3.存在条件：继承关系，方法需要重写，父类引用指向子类对象！Father f1 = new Son();
*
*   1.static 方法，属性类，它不属于实例
*   2.final  常量
*   3.private 方法
* */