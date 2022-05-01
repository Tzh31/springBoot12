package com.example.mybatis.service;

//import com.example.springbootmybatis.model.User;

import com.example.mybatis.model.User;

public interface userService {
    public User queryUserByid(Integer id);
    int addUser(User user);
}
