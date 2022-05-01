package com.example.springbootjsp.config;

import com.example.springbootjsp.loginIntercepter;
import com.example.springbootjsp.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.ServletRegistration;

@Configuration
public class myConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        loginIntercepter intercepter = new loginIntercepter();
        String path[]= {"/user/*"};
//        String excludePath []={"/user/login"};
        registry.addInterceptor(intercepter).addPathPatterns(path);



    }

}
