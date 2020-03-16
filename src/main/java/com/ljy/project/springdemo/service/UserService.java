package com.ljy.project.springdemo.service;

import com.ljy.project.springdemo.dao.UserDao;
import com.ljy.project.springdemo.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public ResultVo getAllUsers();

}
