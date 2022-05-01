package com.config;

import com.bjpowernode.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:config.properties")
@ComponentScan(basePackages = "com.bjpowernode")
public class SpringConfig {
    @Bean
    public Student createStudent(){
        Student myStudent = new Student();
        myStudent.setSex("男");
        myStudent.setName("周仓");
        myStudent.setAge("29");
        return myStudent;
    }
}
