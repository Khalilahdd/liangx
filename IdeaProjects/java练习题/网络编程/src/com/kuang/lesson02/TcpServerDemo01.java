package com.kuang.lesson02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class TcpServerDemo01 {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        ByteArrayOutputStream baos = null;
        InputStream is = null;
        try {

            //1.我得有一个地址
            serverSocket = new ServerSocket(9999);
            //2.等待客户端连接
            socket = serverSocket.accept();
            //读取客户端的消息
            is = socket.getInputStream();

            /*
                   byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                String s = new String(bytes,0,len);
                System.out.println(s);
            }
             */
            //管道流
            baos = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                baos.write(bytes,0,len);
            }

            System.out.println(baos.toString());


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源

            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }






}
