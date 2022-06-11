package com.kuang.lesson03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//还是要等待客户端的链接！
public class UdpServerDemo01 {

    public static void main(String[] args) throws Exception {
        //开放端口
        DatagramSocket socket = new DatagramSocket(9000);
        //接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length);//接收

        socket.receive(packet);//阻塞接收

        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(new String(packet.getData(),0,packet.getLength()));

        //关闭资源
        socket.close();
    }
}
