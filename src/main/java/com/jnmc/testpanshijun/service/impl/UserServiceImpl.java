package com.jnmc.testpanshijun.service.impl;

import com.jnmc.testpanshijun.dao.UserDao;
import com.jnmc.testpanshijun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public boolean login(String uname, String upwd) {
        if (userDao.login(uname,upwd)){
            return true;
        }else {
            return false;
        }
    }
}
