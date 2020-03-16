package com.ljy.project.springdemo.controller;

import com.ljy.project.springdemo.dao.UserDao;
import com.ljy.project.springdemo.domain.User;
import com.ljy.project.springdemo.service.UserService;
import com.ljy.project.springdemo.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@RestController
@RequestMapping(value = "/try")
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user")
    public List<User> getUsers(){
        return userDao.selectUsers();
    }

    @RequestMapping(value = "/getAll")
    public ResultVo getAllUsers(){
        return userService.getAllUsers();
    }
}
