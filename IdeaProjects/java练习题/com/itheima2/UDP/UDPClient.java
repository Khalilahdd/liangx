package com.itheima2.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UDPClient {

    //    UDP面向无连接的协议，UDP通信就好比于两个码头间发运货物，使用集装箱装货，DatagramPacket相当于集装箱，DatagramSocket相当于码头
    public static void main(String[] args) throws Exception {
//        创建一个DatagramSocket（码头）对象,端口3000，
//        这里是发送端，可以不指定端口号，之所以指定了，是为了每次运行时，接收端的getPort()方法的返回返回值都是一致的
        DatagramSocket ds = new DatagramSocket(3000);
        String str = "软件工程创一流";
        byte[] arr = str.getBytes();//将定义的字符串转为字节数组
//        InetAddress.getByName("localhost"),localhost表示本地计算机，也就是我们的主机，因为我们的发送端和接收端都在自己的主机上创建的。
//        创建一个要发送的数据包dp,DatagramPacket类似于集装箱，数据包包括发送的数据，数据的长度，接收端的IP地址和端口号
//        8954是接受端的端口
        DatagramPacket dp = new DatagramPacket(arr, arr.length, InetAddress.getByName("localhost"), 8088);
        System.out.println("发送信息");
        ds.send(dp);//发送数据
        ds.close();//释放资源
    }

}
