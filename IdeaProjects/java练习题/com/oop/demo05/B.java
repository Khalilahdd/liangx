package com.oop.demo05;

/*
* 重写：需要有继承关系，子类重写父类的方法！
* 1.方法名必须相同
* 2.参数列表必须相同
* 3.修饰符：范围可以扩大但不能缩小   public > Protected > Default > private
* 4.抛出异常：范围可以缩小不能扩大     ClassNotFoundException --> Exception(大)
*
* 重写，子类的方法和父类必须一致：方法体不同！
*
* 为什么要重写：
*   1.父类的功能：子类不一定需要，或者不一定满足
* */



//重写都是方法的重写，和属性无关
public class B {
//    public static void text(){
//        System.out.println("B=>text()");
//    }
    public void text(){
        System.out.println("B=>text()");
    }
}
