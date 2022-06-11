package com.atguigu.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ServletContext servletContext = getServletConfig().getServletContext();
        //获取ServletContext对象
        ServletContext context = getServletContext();
        System.out.println(context);
        System.out.println("保存之前 Context1 中获取域数据key1的值是："+ context.getAttribute("key1"));

        context.setAttribute("key1","value1");

        System.out.println("Context1 中获取域数据key1的值是："+ context.getAttribute("key1"));
        System.out.println("Context1 中获取域数据key1的值是："+ context.getAttribute("key1"));
        System.out.println("Context1 中获取域数据key1的值是："+ context.getAttribute("key1"));

    }
}
