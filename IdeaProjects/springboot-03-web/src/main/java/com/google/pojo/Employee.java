package com.google.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//员工表
@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;//0：女    1：男

    private Department department;
    private Date birth;

    public Employee(Integer id, String laseName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = laseName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        //默认日期
        this.birth = new Date();
    }
}
