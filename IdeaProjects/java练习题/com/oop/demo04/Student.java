package com.oop.demo04;

//类     private:私有
public class Student {

    private String name;//名字
    private int id;//学号
    private char sex;//性别
    private int age;//年龄

    //提供一些可以操作这个属性的方法！
    //提供一些public的get、set方法

    //get 获得这个数据
    public String getName(){
        return this.name;
    }

    //set 给这个数据设置值
    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 100 || age < 0){
            this.age = 3;
        }else {
            this.age = age;
        }
    }
}



/**
 *    public static void main(String[] args) {
 *         Student s1 = new Student();
 *
 *         s1.setName("老马");
 *
 *         System.out.println(s1.getName());
 *
 *         s1.setAge(20);
 *         System.out.println(s1.getAge());
 *     }*/
