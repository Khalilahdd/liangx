package com.kuang.demo03;

public class Client {

    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色，现在没有
        ProxyInvitationHandler pih = new ProxyInvitationHandler();
        //通过调用程度处理角色来处理我们要调用的接口对象！
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();//这里的proxy就是动态生成的，我们并没有写~
        proxy.rent();
    }
}
