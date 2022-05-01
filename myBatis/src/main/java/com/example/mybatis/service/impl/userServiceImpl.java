package com.example.mybatis.service.impl;


import com.example.mybatis.Dao.UserMapper;
import com.example.mybatis.Dao.userDao;
import com.example.mybatis.model.User;
import com.example.mybatis.service.userService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class userServiceImpl implements userService {
    @Resource
    userDao userDao;
    @Resource
    UserMapper userMapper;
    @Override
    public User queryUserByid(Integer id) {
        return userDao.selectById(id);
    }
@Transactional
    @Override
    public int addUser(User user) {

        int row= userMapper.insert(user);
int d=1/0;
        return row;
    }
}
