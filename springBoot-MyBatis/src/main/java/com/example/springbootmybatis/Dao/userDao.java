package com.example.springbootmybatis.Dao;

import com.example.springbootmybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface userDao {
    public User selectById(Integer id);
}
