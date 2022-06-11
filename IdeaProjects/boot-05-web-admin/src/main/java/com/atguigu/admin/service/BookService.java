package com.atguigu.admin.service;

import com.atguigu.admin.bean.Book;
import com.atguigu.admin.mapper.BookMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;

    public Book getBookById(Long id) {

        return bookMapper.getBookById(id);
    }
}
