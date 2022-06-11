package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestAPIServlet extends HttpServlet {
    /**
     * 1.getRequestURI()    获取请求的资源路径
     * 2.getRequestURL()    获取请求的统一资源定位符（绝对路径）
     * 3.getRemoteHost()    获取客户端的ip地址
     * 4.getHeader()        获取请求头
     * 5.getParameter()     获取请求的参数
     * 6.getParameterValues()   获取请求的参数（多个值的时候使用）
     * 7.getMethod()        获取请求的方式GET或POST
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1.getRequestURI()    获取请求的资源路径
        System.out.println("URI => " + req.getRequestURI());
        //2.getRequestURL()    获取请求的统一资源定位符（绝对路径）
        System.out.println("URL => " + req.getRequestURL());
        //3.getRemoteHost()    获取客户端的ip地址
        /**
         * 在IDEA中，使用localhost访问时，得到的客户端ip 地址是===》》》 127.0.0.1
         * 在IDEA中，使用127.0.0.1访问时，得到的客户端ip 地址是===》》》 127.0.0.1
         * 在IDEA中，使用真实ip 访问时，得到的客户端ip 地址是===》》》 真实的客户端ip 地址<br/>
         */
        System.out.println("客户端 ip地址 => " + req.getRemoteHost());
        //4.getHeader()        获取请求头
        System.out.println("请求头User-Agent ==>> " + req.getHeader("User-Agent"));
    }
}
