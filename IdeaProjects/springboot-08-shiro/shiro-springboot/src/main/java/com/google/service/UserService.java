package com.google.service;

import com.google.pojo.User;

public interface UserService {

    User queryUserByName(String name);
}
