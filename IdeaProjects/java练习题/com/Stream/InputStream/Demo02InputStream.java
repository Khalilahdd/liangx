package com.Stream.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    字节输入流一次读取多个字节的方法：
        int read(byte[] b) 从输入流读取一些数量字节数，并将它们存储到缓冲区数组b中。
    明确两件事情:
        1.方法的参数byte[]的作用？
            起到缓冲作用，存储每次读取到的多个字节
            数组的长度--把定义为1024（1kb）或者1024的整数倍
        2.方法的返回值int是什么？
            每次读取的有效字节个数

    String类的构造方法：
        String(byte[] bytes):把字节数组转换为字符串
        String(byte[],int offset,int length):把字节数组的一部分转换为字符串 offset：数组开始索引 length：转换为字节个数
 */
public class Demo02InputStream {

    public static void main(String[] args) throws IOException {
        //创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\杂乱无章\\b.txt");
        //使用FileInputStream对象中的方法read读取文件
        //int read(byte[] b) 从输入流读取一些数量字节数，并将它们存储到缓冲区数组b中。
//        byte[] bytes = new byte[2];
//        int len = fis.read(bytes);
//        System.out.println(len);//2
//        System.out.println(Arrays.toString(bytes));//[49, 48]
//        System.out.println(new String(bytes));//10
//
//        len = fis.read(bytes);
//        System.out.println(len);//2
//        System.out.println(new String(bytes));//0A
//
//        len = fis.read(bytes);
//        System.out.println(len);//2
//        System.out.println(new String(bytes));//BC
//
//        len = fis.read(bytes);
//        System.out.println(len);//2
//        System.out.println(new String(bytes));//DE
//
//        len = fis.read(bytes);
//        System.out.println(len);//2
//        System.out.println(new String(bytes));//BC
//
//        len = fis.read(bytes);
//        System.out.println(len);//-1
//        System.out.println(new String(bytes));//BC

        /*
            发现以上读取是一个重复的过程，可以使用循环优化
            不知道文件中有多少个字节，所以使用while循环
            while循环结束的条件，读取到-1结束
         */
        byte[] bytes = new byte[1024];//存储读取到的多个字节
        int len = 0;//记录每次读取的有效字节个数
        while ((len = fis.read(bytes)) != -1) {
            //String(byte[],int offset,int length):把字节数组的一部分转换为字符串 offset：数组开始索引 length：转换为字节个数
            System.out.println(new String(bytes,0,len));
        }
        //释放资源
        fis.close();
    }
}
