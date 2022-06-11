package com.kuang.lesson04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDown {

    public static void main(String[] args) throws Exception {
        //1.下载地址
        URL url = new URL("https://m10.music.126.net/20210319201029/4e9ee63e9f15e79c6802d89f7771f9a9/yyaac/obj/wonDkMOGw6XDiTHCmMOi/3047701429/8387/417b/963a/ba260f69cdf90f4717057ded5f1e8074.m4a");

        //2.连接到这个资源 HTTP
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();

        File file;
        FileOutputStream fos = new FileOutputStream("她说.m4a");

        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            fos.write(bytes,0,len);//写出这个数据
        }

        fos.close();
        inputStream.close();
        urlConnection.disconnect();//断开连接
    }
}
