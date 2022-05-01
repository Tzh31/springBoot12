package com.example.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class jspcontroller {

    @RequestMapping("user/index")
    public String index(HttpServletRequest request){
        request.setAttribute("data","hahahaha");
        return "index";
    }
    @ResponseBody
    @RequestMapping("/user/account")
    public String index1(HttpServletRequest request){
//        request.setAttribute("data","hahahaha");
        String d="ha";
        return d;
    }
}
