package com.google.swagger.controller;

import com.google.swagger.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("Hello控制类")
@RestController
public class HelloController {

    //  默认请求/error
    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    //只要我们的接口中，返回值中存在实体类，他就会被扫描到Swagger中
    @PostMapping(value="/user")
    public User user() {
        return new User();
    }

    //Operation 接口  作用域是方法
    @ApiOperation("Hello控制类")
    @GetMapping(value="/hello2")
    public String hello2(@ApiParam("用户名")String username){
        return "hello"+username;
    }

    @ApiOperation("Post测试类")
    @PostMapping(value="/post")
    public User post(@ApiParam("用户名")User user){
        return user;
    }
}
