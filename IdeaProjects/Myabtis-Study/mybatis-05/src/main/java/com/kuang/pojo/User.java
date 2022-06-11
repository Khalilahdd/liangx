package com.kuang.pojo;

import lombok.*;

//实体类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private String password;


}
