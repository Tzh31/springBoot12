package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.model.User;
import com.example.springbootmybatis.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class userController {

    @Resource
    userService userService;
    @ResponseBody
@RequestMapping("/student/query")
    public String queryUser(Integer id){
        User user = userService.queryUserByid(id);
        return user.toString();
    }
}
