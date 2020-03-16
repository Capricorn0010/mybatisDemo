package com.ljy.project.springdemo.dao;

import com.ljy.project.springdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> selectUsers();

    @Select("select * from user")
    public List<User> getAllUsers();
}
