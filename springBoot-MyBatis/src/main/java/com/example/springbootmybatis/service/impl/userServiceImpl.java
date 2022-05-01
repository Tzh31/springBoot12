package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.Dao.userDao;
import com.example.springbootmybatis.model.User;
import com.example.springbootmybatis.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userServiceImpl implements userService {
    @Resource
   userDao userDao;
    @Override
    public User queryUserByid(Integer id) {
        return userDao.selectById(id);
    }
}
