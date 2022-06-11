package com.google.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

//zookeeper：服务注册与发现
@Service    //可以被扫描到，在项目已启动就自动注册到注册中心
@Component  //使用了Dubbo就尽量不要使用Service注解
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "《Java从入门到入土》";
    }
}
