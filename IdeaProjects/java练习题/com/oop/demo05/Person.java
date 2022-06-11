package com.oop.demo05;

//在java中，所以的类，都默认 直接或者间接继承Object类
//Person 人:父类
public class Person {
//
//    //public
//    //protected
//    //default
//    //private
//    int money = 10_0000_0000;
//
//    public void say(){
//        System.out.println("说了一句话");
    protected String name = "laoma";

    public void print(){
        System.out.println("Person");
    }
}
/*
*    public static void main(String[] args) {

        Student student = new Student();
        //student.say();
        //student.text("老张");
        student.text1();
    }
}*/