package com.ljy.project.springdemo.service.Impl;

import com.ljy.project.springdemo.dao.UserDao;
import com.ljy.project.springdemo.domain.User;
import com.ljy.project.springdemo.service.UserService;
import com.ljy.project.springdemo.vo.CodeMsg;
import com.ljy.project.springdemo.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public ResultVo getAllUsers() {
        List<User> allUsers = userDao.getAllUsers();
        if(allUsers.size()==0){
            return ResultVo.error(CodeMsg.SELECT_ERROR);
        }else{
            return ResultVo.success(allUsers);
        }
    }
}
