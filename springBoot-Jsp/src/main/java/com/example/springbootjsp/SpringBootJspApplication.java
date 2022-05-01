package com.example.springbootjsp;

import com.example.springbootjsp.service.userService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ServletComponentScan(basePackages = {"com.example.springbootjsp.web"})//servlet扫描

public class SpringBootJspApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("创建之前");
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootJspApplication.class, args);
        userService userService = (com.example.springbootjsp.service.userService) run.getBean("userServiceImpl");
        userService.say("哈哈");
        System.out.println("容器创建完之后");
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("创建完之后的方法付");
    }
}
