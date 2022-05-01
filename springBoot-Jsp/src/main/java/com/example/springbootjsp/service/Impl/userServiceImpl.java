package com.example.springbootjsp.service.Impl;

import com.example.springbootjsp.service.userService;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
    @Override
    public void say(String name) {
        System.out.println("我的名字是"+name);
    }
}
