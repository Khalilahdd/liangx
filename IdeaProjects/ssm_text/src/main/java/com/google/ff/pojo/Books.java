package com.google.ff.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookID;//图书ID
    private String bookName;//图书名称
    private int number;//馆藏数量

}
