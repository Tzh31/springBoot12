package com.example.thymeleaf.model;

public class user {
    private String name;
    private String age;

    public user() {
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

    public user(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
