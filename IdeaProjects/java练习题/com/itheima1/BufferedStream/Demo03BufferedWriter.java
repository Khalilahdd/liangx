package com.itheima1.BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.BufferedWriter extends writer
    BufferedWriter：字符缓冲输出流

    继承自父类的共性成员方法：
        - void write(int c) 写一个字符
        - void write(char[] cbuf) 写入一个字符数组。
        - abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
        - void write(String str) 写一个字符串
        - void write(String str, int off, int len) 写一个字符串的一部分
        - void flush() 刷新流。
        - void close() 关闭流，先刷新。

    构造方法：
        BufferedWriter(Writer out) 创建使用默认大小的输出缓冲区的缓冲字符输出流。
        BufferedWriter(Writer out, int sz) 创建一个新的缓冲字符输出流，使用给定大小的输出缓冲区。
        参数：
            writer out：字符输出流
                我们可以传递FileWriter，缓冲流会给FileWriter增加一个缓冲区，提高FileWriter的写入效率
            int sz : 指定缓冲区的大小，不写默认大小

    特有的成员方法：
        void newline() 写入一个行分隔符，会根据不同的操作系统，获取不同的行分隔符
        换行：换行符号
        Windows：\r\n
        Linux:/n
        mac:/r
    使用步骤：
        1.创建字符缓冲输出流对象，构造方法中传递字符输出流
        2.调用字符缓冲输出流中的方法write，把数据写入到内存的缓冲区中
        3.调用字符缓冲输出流中的方法flush，把内存缓冲区中的数据，刷新到文件中
        4.释放资源
 */
public class Demo03BufferedWriter {

    public static void main(String[] args) throws IOException {
        //1.创建字符缓冲输出流对象，构造方法中传递字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\\\杂乱无章\\\\g.txt"));

        //2.调用字符缓冲输出流中的方法write，把数据写入到内存的缓冲区中
        for (int i = 0; i < 10; i++) {
            bw.write("传智播客");
            //bw.write("\r\n");
            bw.newLine();
        }
        //3.调用字符缓冲输出流中的方法flush，把内存缓冲区中的数据，刷新到文件中
        bw.flush();
        //4.释放资源
        bw.close();
    }
}
