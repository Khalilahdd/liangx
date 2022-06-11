package com.oop.demo09;

//interface 定义的关键字， 接口需要有实现类
public interface UserService {

    //常量~
    int age = 99;
    //接口中的所以定义的方法其实都是抽象的 public abstract
    //void run();
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
