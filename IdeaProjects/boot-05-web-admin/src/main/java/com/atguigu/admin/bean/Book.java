package com.atguigu.admin.bean;

import lombok.Data;

@Data
public class Book {

    private long id;
    private String name;
    private Double price;
    private String author;
    private long sales;
    private long stock;
    private String img_path;
}
