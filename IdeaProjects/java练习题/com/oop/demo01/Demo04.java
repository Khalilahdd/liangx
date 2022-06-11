package com.oop.demo01;

//值传递
public class Demo04 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);

        Demo04.change(a);
        System.out.println(a);
    }
    //将a的值传递过来之后，只是走了一遍流程，因为是void，所以最后结果还是1
    public static void change(int a){
        a = 10;
    }
}
