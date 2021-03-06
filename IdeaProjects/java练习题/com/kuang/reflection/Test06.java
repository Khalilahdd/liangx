package com.kuang.reflection;

public class Test06 {

    public static void main(String[] args) throws ClassNotFoundException {

        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器-->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器的父类加载器-->根加载器（C/C++）
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.kuang.reflection.Test06").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置的类是谁加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        //如何获得系统类加载器可以加载的路径

        System.out.println(System.getProperty("java.class.path"));

        /*
        D:\Computer\数据库大作业\production\java练习题;
        E:\java练习题\com\lib\commons-io-2.8.0.jar;
        C:\Users\ASUS\.m2\repository\junit\junit\4.12\junit-4.12.jar;
        C:\Users\ASUS\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar
         */
    }
}
