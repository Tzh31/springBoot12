package com.example.springboot2;

import com.example.springboot2.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpringBoot {
    @Value("${student.name}")
    String name;
    @Autowired
    Student student;
    @RequestMapping("/hello")

    @ResponseBody
public String hello(){
    return "欢迎欢迎"+name;
}


    @RequestMapping("/info")
    @ResponseBody
    public String info(){
        return student.toString();
    }
}