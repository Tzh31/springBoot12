package com.example.mybatis.controller;

import com.example.mybatis.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class userController {

    @Resource
    com.example.mybatis.service.userService userService;
    @ResponseBody
@RequestMapping("/student/query")
    public String queryUser(Integer id){
        User user = userService.queryUserByid(id);
        return user.toString();
    }

    @ResponseBody
    @RequestMapping(value = "/user/add")
    public Object addUser(User user){
        int i = userService.addUser(user);
        return i;
    }

  @GetMapping("/student/querys/{id}")
    public String queryUsers(@PathVariable("id") Integer id){
        User user = userService.queryUserByid(id);
        return user.toString();
    }
    @PostMapping("/student/{name}/{pwd}")
    public String createStudent(@PathVariable("name") String name,@PathVariable("pwd") String pwd){
        return name+pwd;
    }
@PutMapping("/student/test")
    public String test(){
return "执行";
    }
}
