package com.File.demo01.File;

import java.io.File;

/*
   路径：
        绝对路径：是一个完整的路径
            以盘符（c:,D:）开始的路径
                c:\\a.txt
                c:\\Users\itcast\\IdeaProjects\\shungyuan\\123.txt
                D:\\demo\\b.txt
       相对路径：是一个简化的路径
            相对指的是相对于当前项目的根目录（c:\\Users\\itcast\\IdeaProjects\\shungyuan\\123.txt）
            如果使用当前项目的根目录，路径简化简化书写
               c:\\Users\\itcast\\IdeaProjects\\shungyuan\\123.txt-->简化为：123.txt(可以省略项目的根目录)
      注意：
        1.路径是不区分大小写
        2.路径中的文件名称分隔符windows使用方，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
 */
public class Demo02File {

    public static void main(String[] args) {
        /*
            File类的构造方法
         */
        //show01();
        //show02("C:\\","a.txt");
        show03();
    }

    /*
        File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例。
        参数：把路径分成两部分
            File parent:父路径
            String child:子路径
        好处：
            父路径和子路径，可以单独书写，使用起来非常灵活；父路径和子路径都可以变化
            父路径是File类型，可以使用File的方法对路径进行一些操作，再使用路径创建对象
     */
    private static void show03() {

        File parent = new File("C:\\");
        File file = new File(parent,"hello.java");
        System.out.println(file);//C:\hello.java
    }

    /*
        File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例
        参数：把路径分成两部分
            String parent:父路径
            String child:子路径
        好处：
            父路径和子路径，可以单独书写，使用起来非常灵活；父路径和子路径都可以变化

     */
    private static void show02(String parent,String child) {

        File file = new File(parent,child);
        System.out.println(file);//C:\a.txt
    }

    /*
        File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例
        参数：
            String pathname：字符串的路径名称
            路径可以是以文件结尾，也可以是以文件夹结尾
            路径可以是相对路径，也可以是绝对路径
            路径可以是存在，也可以是不存在
            创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
     */
    private static void show01() {

        File f1 = new File("E:\\java练习题\\a.txt");
        System.out.println(f1);//重写了Object类的toString方法  E:\java练习题\a.txt

        File f2 = new File("E:\\java练习题");
        System.out.println(f2);//E:\java练习题

        File f3 = new File("b.txt");
        System.out.println(f3);//b.txt
    }
}
