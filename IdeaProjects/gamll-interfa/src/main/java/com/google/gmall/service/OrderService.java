package com.google.gmall.service;

import com.google.gmall.bean.UserAddress;

import java.util.List;

public interface OrderService {

    /**
     * 初始化订单ID
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);
}
