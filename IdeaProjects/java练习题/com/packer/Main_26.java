package com.packer;

import java.util.HashMap;
import java.util.Map;

public class Main_26 {
    public static void main(String[] args) {
        Student s = new Student("Xian ming",99);
        Map<String,Student> map = new HashMap<>();
        map.put("Xian ming",s);//将“Xian ming”和Student实例映射并关联
        Student target = map.get("Xian ming");//通过key查找并返回映射的Student实例
        System.out.println(target == s);//true，同一个实例
        System.out.println(target.score);//99
        Student another = map.get("Bob");//通过另一个key查找
        System.out.println(another);//未找到返回null
    }
}
class Student {
    public String name;
    public int score;
    public Student(String name,int score) {
        this.name = name;
        this.score = score;
    }
}