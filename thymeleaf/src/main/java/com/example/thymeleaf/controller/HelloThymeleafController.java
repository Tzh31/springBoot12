package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloThymeleafController {

@GetMapping("/hello")
    public String helloThymeleaf(Model model)
    {
        model.addAttribute("data","欢迎");
        return "hello";
    }
@GetMapping("/getUser")
    public  String getUser(Model model){
    model.addAttribute("user",new user("haha","22"));
    List<user>users=new ArrayList<>();
    users.add(new user("挖个","13"));
    users.add(new user("挖个","13"));
    users.add(new user("挖个","13"));
    model.addAttribute("users",users);
    return "user";
}
    @GetMapping("/getUsers")
    @ResponseBody
    public  String getUsers(String id){
//        model.addAttribute("user",new user("haha","22"));
        System.out.println(id);
        return id;
    }
    @GetMapping("/property")
    public String property(Model model){
    model.addAttribute("method","post");
    model.addAttribute("data","heiehei");
return "hello";
    }
}
