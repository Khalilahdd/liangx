package com.itheima1.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    java.io.ObjectOutputStream extends  OutputStream
    ObjectOutputStream：对象的序列化流
    作用：把对象以流的方法写入到文件中保存

    构造方法：
        ObjectOutputStream(OutputStream out) 创建一个写入指定的OutputStream的ObjectOutputStream。
        参数：
            OutputStream out：字节输出流
    特有的方法：
        void writeObject(Object obj) ：将指定的对象写入ObjectOutputStream

    使用步骤：
        1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        2.创建ObjectOutputStream对象中的方法writeObject把对象写入到文件中
        3.释放资源
 */
public class Demo01ObjectOutputStream {

    public static void main(String[] args) throws IOException {
        //1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\\\杂乱无章\\\\b.txt"));
        // 2.创建ObjectOutputStream对象中的方法writeObject把对象写入到文件中
        oos.writeObject(new Person("迪丽热巴",28));//NotSerializableException
        //3.释放资源
        oos.close();
    }
}
