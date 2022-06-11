package com.oop.demo05;
/*
* super注意点：
* 1.super调用父类的构造方法，必须在构造方法的第一个
* 2.super必须只能出现在子类的方法或者构造方法中！
* 3.super和this不能同时调用构造方法
* VS this
*       代表的对象不同：
*           this：本身调用者 这个 对象
*           super：代表父类对象的应用
*       前提
*           this：没有继承也可以使用
*           super：只能在继承条件才可以使用
*       构造方法
*           this():本类的构造
*           super()：父类的构造
* */
//学生  is 人：派生类 子类
public class Student extends Person{


    public Student(){
        //隐藏代码：调用了父类的无参构造
        super();//调用父类的构造器，必须要在子类构造器的第一行
        System.out.println("Student无参执行了");
    }

    public Student(String name) {
        this.name = name;
    }

    private String name = "laozhang";

//    public void text(String name){
//        System.out.println(name);
//        System.out.println(this.name);
//        System.out.println(super.name);
//    }
    public void print(){
        System.out.println("Student");
    }
    //私有的东西可以继承，但没有访问权限
    public void text1(){
        print();//Student
        this.print();//Student
        super.print();//Person
    }

    public void text(String name){

    }
}
