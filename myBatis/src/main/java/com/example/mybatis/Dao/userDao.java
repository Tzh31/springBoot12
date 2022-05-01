package com.example.mybatis.Dao;

//import com.example.springbootmybatis.model.User;

import com.example.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface userDao {
    public User selectById(Integer id);
}
