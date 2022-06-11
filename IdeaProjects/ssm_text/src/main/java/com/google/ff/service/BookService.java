package com.google.ff.service;

import com.google.ff.dto.AppointExecution;
import com.google.ff.pojo.Books;

import java.util.List;

public interface BookService {

    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookByID(int bookId);

    //更新一本书
    int updateBook(Books books);
    /**
     *
     * @param bookId
     * @return
     */
    Books getById(int bookId);


    /**
     * 查询一本书
     * @param bookName
     * @return
     */
    Books getByName(String bookName);

    /**
     * 查询所有图书
     * @return
     */
    List<Books> queryList();

    /**
     * 预约图书
     * @param bookId
     * @param studentId
     * @return
     */
    AppointExecution appoint(int bookId,int studentId);
}