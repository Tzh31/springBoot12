package com.bjpowernode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Tiger")
public class Tagger {
    @Value("${tiger.name}")
    private String name;
    @Value("${tiger.age}")
    private  String age;

    @Override
    public String toString() {
        return "Tagger{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
