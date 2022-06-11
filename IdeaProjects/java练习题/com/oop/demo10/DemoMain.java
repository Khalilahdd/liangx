package com.oop.demo10;

//import javax.swing.*;

public class DemoMain {

    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标，供电脑使用
        //Mouse mouse = new Mouse();
        //首先进行向上转型
        USB usb = new Mouse();
        //参数是USB类型，我正好传递进去的就是鼠标
        computer.useDevice(usb);

        //创建一个usb键盘
        Keyboard keyboard = new Keyboard();//没有使用多态写法
        //方法参数是usb类型，传递进去的是实现类对象

        computer.useDevice(keyboard);//正确写法！也发生了向上转型
//        computer.useDevice(new Keyboard());//也是正确写法

        computer.poweroff();
        System.out.println("===============");

        method(10.0);//正确写法   double --> double
        method(20);//正确写法~     int --> double
        int a = 30;
        method(a);//正确写法 int --> double
    }

    public static void method(double num){
        System.out.println(num);
    }
}
