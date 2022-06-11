package com.itheima2.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

    public static void main(String[] args) throws Exception {
//        创建一个长度为1024的字节数组，用于接受数据
        byte[] buf = new byte[1024];
//        定义一个DatagramSocket对象，监听的端口号为8954。(DatagramSocket类似于码头)，
//        在创建接收端的DatagramSocket对象时，必须指明一个端口号，这样就可以监听指定的端口
        DatagramSocket ds = new DatagramSocket(8088);
//        定义一个DatagramPacket对象，用于接受数据。(DatagramPacket类似于集装箱)，
//        （buf,buf.length）封装数据的字节数组和数据的大小，没有指定IP地址和端口号，很明显，只能用于接收端。
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        System.out.println("等待接受数据");
//        该方法用于将接收到的数据填充到DatagramPacket数据包中，在接受到数据之前会一直处于阻塞状态（等待接受数据，如果没有数据则会阻塞），只有当接受到数据包时，该方法才会返回
        ds.receive(dp);
//        getData()方法用于返回将要接受或者将要发送的数据，如果是发送端的DatagramPacket对象，就返回将要发送的数据，如果是接受端的就返回接收到的数据。
//        getAddress()方法用于返回发送端或者接收端的IP地址，如果是发送端的DatagramPacket对象，就返回就接收端的IP地址，反之，就返回发送端的IP地址
//        getHostAddress()得到字符串格式的原始IP地址
//        getPort()方法用于返回发送端或者接收端的端口号，如果是发送端的DatagramPacket对象，就返回接受端的端口号，反之，就返回发送端的端口号
//        获取接收到的数据，包括数据内容、长度、发送端的IP地址和端口号
        String str = new String(dp.getData(), 0, dp.getLength()) + "from" + dp.getAddress().getHostAddress() + ":" + dp.getPort();
        System.out.println(str);
        ds.close();//释放资源
    }
}
