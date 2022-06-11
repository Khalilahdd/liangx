package com.itheima1.ReverseStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
    java.io.OutputStreamWriter extends writer
    OutputStreamWriter是字符的桥梁流以字节流：向其写入的字符编码成使用指定的字节charset 。 它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。 （编码：把能看懂的变成看不懂的）

    继承父类的共性成员方法：
        - void write(int c) 写一个字符
        - void write(char[] cbuf) 写入一个字符数组。
        - abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
        - void write(String str) 写一个字符串
        - void write(String str, int off, int len) 写一个字符串的一部分
        - void flush() 刷新流。
        - void close() 关闭流，先刷新。
    构造方法：
        OutputStreamWriter(OutputStream out)创建一个使用默认字符编码的OutputStreamWriter。
        OutputStreamWriter(OutputStream out, String charsetName) 创建一个使用命名字符集的OutputStreamWriter。
        参数：
            OutputStream out：字节输出流，可以用来写转换之后的字节到文件中
            String charsetName:指定的编码表名称，不区分大小写，可以是utf-8/UTF-8，gbk/GBK...不指定默认使用UTF-8
    使用步骤：
        1.创建一个OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        2.使用OutputStreamWriter对象中的方法，把字符转换为字节存储缓冲区中（编码）
        3.使用OutputStreamWriter对象中的方法，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        4.释放资源
 */
public class Demo02OutputStreamWriter {

    public static void main(String[] args) throws IOException {
        //write_utf_8();
        write_gbk();
    }

    /*
        使用转换流OutputStreamWriter写gbk格式的文件
     */
    private static void write_gbk() throws IOException {
        //1.创建一个OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\\\杂乱无章\\\\g.txt"),"gbk");
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\\\杂乱无章\\\\g.txt"));//不指定使用UTF-8格式
        //2.使用OutputStreamWriter对象中的方法，把字符转换为字节存储缓冲区中（编码）
        osw.write("你好");
        //3.使用OutputStreamWriter对象中的方法，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        osw.flush();
        //4.释放资源
        osw.close();
    }

    /*
        使用转换流OutputStreamWriter写UTF-8格式的文件
     */
    private static void write_utf_8() throws IOException {
        //1.创建一个OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\\\杂乱无章\\\\g.txt"),"utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\\\杂乱无章\\\\g.txt"));//不指定使用UTF-8格式
        //2.使用OutputStreamWriter对象中的方法，把字符转换为字节存储缓冲区中（编码）
        osw.write("你好");
        //3.使用OutputStreamWriter对象中的方法，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        osw.flush();
        //4.释放资源
        osw.close();
    }
}
