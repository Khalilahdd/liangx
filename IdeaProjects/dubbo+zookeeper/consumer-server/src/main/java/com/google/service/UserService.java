package com.google.service;


import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service    //放到容器中~
public class UserService {

    //想拿到provider-server提供的票，我们需要去拿去注册中心的服务
    @Reference  //引用。   Pom坐标，可以定义路径相同的接口名
    TicketService ticketService;

    public void buyTicket() {
        String ticket = ticketService.getTicket();
        System.out.println("在注册中心拿到=>"+ticket);
    }

}
