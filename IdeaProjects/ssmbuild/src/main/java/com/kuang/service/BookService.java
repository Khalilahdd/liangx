package com.kuang.service;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookByID(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookByID(int id);

    //查询全部书
    List<Books> queryAllBook();

    Books queryBookByName(String bookName);
}
