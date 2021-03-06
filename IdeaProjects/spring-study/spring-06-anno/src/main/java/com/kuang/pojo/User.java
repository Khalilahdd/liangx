package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//等价于 <bean id="user" class="com.kuang.pojo.User"/>
//@Component 组件
@Component
@Scope("prototype")
public class User {

//    public String name = "迪丽热巴";

    public String name;

    //相当于 <property name="name" value="古力娜扎"/>
    @Value("古力娜扎")
    public void setName(String name) {
        this.name = name;
    }
}
