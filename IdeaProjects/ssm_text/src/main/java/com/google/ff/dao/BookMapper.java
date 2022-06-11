package com.google.ff.dao;

import com.google.ff.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookByID(@Param("bookId") int bookId);

    //更新一本书
    int updateBook(Books books);
    /**
     * 通过ID查询图书
     * @param bookId
     * @return
     */
    Books queryBookById(@Param("bookId")int bookId);

    /**
     * 通过书名查询单本图书
     *
     * @param bookName
     * @return
     */
    //查询书籍
    Books queryBookByName(@Param("bookName") String bookName);


    /**
     * 查询所以图书
     *
     * @return
     */
    List<Books> queryAllBook();


    /**
     * 减少馆藏数量
     *
     * @param bookId
     * @return 如果影响行数等于大于1，表示更新的记录行数
     */
    int reduceNumber(int bookId);
}
