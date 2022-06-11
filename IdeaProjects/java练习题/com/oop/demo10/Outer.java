package com.oop.demo10;

public class Outer {

//    private int id = 10;
//    public void out(){
//        System.out.println("这是外部类的方法");
//    }
//
//    public class Inner{
//        public void in(){
//            System.out.println("这是内部类的方法");
//        }
//
//        //获得外部类的私有属性
//        public void getID(){
//            System.out.println(id);
//        }
//    }

}

//一个java类中可以有多个class类，但是只能有一个public class 类
class A{
    public static void main(String[] args) {

    }
}
/*
 public static void main(String[] args) {
    Outer outer = new Outer();

        //通过这个外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();
    }*/