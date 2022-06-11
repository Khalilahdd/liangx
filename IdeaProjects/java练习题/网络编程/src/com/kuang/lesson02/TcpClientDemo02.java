package com.kuang.lesson02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientDemo02 {

    public static void main(String[] args) throws Exception {
        //1.创建一个Socket连接
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9000);
        //2.创建一个输出流
        OutputStream os = socket.getOutputStream();

        //3.读取文件
        FileInputStream fis = new FileInputStream(new File("E:\\素材\\优质的壁纸\\1 (1).jpg"));
        //4.写出文件
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes))!= -1) {
            os.write(bytes,0,len);
        }

        //通知服务器，我已经结束了
        socket.shutdownOutput();//我已经传输完了

        //确定服务器接收完毕，才能够断开连接
        InputStream is = socket.getInputStream();
        //String byte[]
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] bytes1 = new byte[1024];
        int len2;
        while ((len2 = is.read(bytes1)) != -1) {
            baos.write(bytes1,0,len2);
        }
        System.out.println(baos.toString());

        //5.关闭资源
        baos.close();
        is.close();
        fis.close();
        os.close();
        socket.close();
    }
}
