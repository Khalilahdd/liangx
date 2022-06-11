package com.google.ff.dao;

import com.google.ff.dto.AppointExecution;
import com.google.ff.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {



    @Test
    public void test() {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
//        Book book = bookServiceImpl.getById(1000);
//        List<Book> books = bookServiceImpl.getList();
//        for (Book book : books) {
//            System.out.println(book);
//        }
        AppointExecution appoint = bookServiceImpl.appoint(1000,124312321);
        System.out.println(appoint);
    }
}
