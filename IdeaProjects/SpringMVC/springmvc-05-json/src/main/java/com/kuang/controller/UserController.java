package com.kuang.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.kuang.pojo.User;
import com.kuang.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController//不需要走视图解析器
public class UserController {

    @RequestMapping("/j1")
    //@ResponseBody   //它就不会走视图解析器，会直接返回一个字符串
    public String json01() throws JsonProcessingException {

        //jackson   ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        User user = new User("迪丽热巴",28,"女");

        String str = mapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        List<User> userList = new ArrayList<User>();

        User user1 = new User("迪丽热巴",28,"女");
        User user2 = new User("古力娜扎",28,"女");
        User user3 = new User("佟丽娅",28,"女");
        User user4 = new User("IU",28,"女");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String str = mapper.writeValueAsString(userList);
        return str;
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {

        Date date = new Date();

        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");

    }

    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {


        List<User> userList = new ArrayList<User>();

        User user1 = new User("迪丽热巴",28,"女");
        User user2 = new User("古力娜扎",28,"女");
        User user3 = new User("佟丽娅",28,"女");
        User user4 = new User("IU",28,"女");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String string = JSON.toJSONString(userList);
        return string;
    }
}
