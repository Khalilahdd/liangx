package com.kuang.demo04;

import com.kuang.demo02.UserService;
import com.kuang.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvitationHandler pih = new ProxyInvitationHandler();

        pih.setTarget(userService);//设置要代理的对象
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
    }
}
