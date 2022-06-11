package com.itheima1.ReverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    java.io.InputStreamReader extends Reader
    InputStreamReader是从字节流到字符流的桥：它读取字节，并使用指定的charset将其解码为字符 。 它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。 (解码：把看不懂的变成看懂的)

    继承父类共性的方法：
        int read():读取单个字符并返回。
        int read(char[] cbuf):一次读取多个字符，将字符读入数组
        void close():关闭该流并释放与之相关联的所以资源
    构造方法：
        InputStreamReader(InputStream in)创建一个使用默认字符集的InputStreamReader。
        InputStreamReader(InputStream in, String charsetName) 创建一个使用命名字符集的InputStreamReader。
        参数：
            InputStream in：字节输入流，用来读取文件中保存的字节
            String charsetName:指定的编码表名称，不区分大小写，可以是utf-8/UTF-8，gbk/GBK...不指定默认使用UTF-8
    使用步骤：
        1.创建InputStreamReader对象，构造方法中传递字符输入流和指定的编码表名称
        2.创建InputStreamReader对象中的方法read读取文件
        3.释放资源
    注意事项：
        构造方法中指定的编码表名称要和文件的编码相同，否则会发现乱码
 */
public class Demo03InputStreamReader {

    public static void main(String[] args) throws IOException {
        //read_utf_8();
        read_gbk();
    }

    /*
        使用InputStreamReader读取gbk格式的文件
     */
    private static void read_gbk() throws IOException {
        //1.创建InputStreamReader对象，构造方法中传递字符输入流和指定的编码表名称
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\\\杂乱无章\\\\g.txt"),"utf-8");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\\\杂乱无章\\\\a.txt"),"GBK");
        //2.创建InputStreamReader对象中的方法read读取文件
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.println((char) len);
        }
        //3.释放资源
        isr.close();
    }

    /*
        使用InputStreamReader读取UTF-8格式的文件
     */
    private static void read_utf_8() throws IOException {
        //1.创建InputStreamReader对象，构造方法中传递字符输入流和指定的编码表名称
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\\\杂乱无章\\\\g.txt"),"utf-8");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\\\杂乱无章\\\\g.txt"));
        //2.创建InputStreamReader对象中的方法read读取文件
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.println((char) len);
        }
        //3.释放资源
        isr.close();
    }
}
