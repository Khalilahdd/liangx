package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {

    public Book getBookById(Long id);

}
