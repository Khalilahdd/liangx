package com.google.ff.controller;

import com.google.ff.pojo.Books;
import com.google.ff.pojo.Msg;
import com.google.ff.service.BookService;
import com.google.ff.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/book")
    @ResponseBody
    public Msg getList() {
        List<Books> list = bookService.queryList();
        return Msg.success().add("books",list);
    }
}
