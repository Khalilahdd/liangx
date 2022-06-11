package com.oop.demo10;

public class Test {

    public static void main(String[] args) {
        //Apple apple = new Apple();
        //匿名：没有名字的参数类
        new Apple().eat();

        new UserService(){

            @Override
            public void hello() {

            }
        };
    }
}

class Apple{
    public void eat(){
        System.out.println("1");
    }
}

interface UserService{
    void hello();
}