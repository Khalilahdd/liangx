package com.itheima.demo03.Generic;

public class Demo04GenericInterface {

    public static void main(String[] args) {
        //创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gl1 = new GenericInterfaceImpl1();
        gl1.method("字符串");

        //创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gl2 = new GenericInterfaceImpl2<>();
        gl2.method(10);

        GenericInterfaceImpl2<Double> gl3 = new GenericInterfaceImpl2<>();
        gl3.method(8.8);
    }
}
