package com.lirh.login.server.impl;

import com.lirh.login.dao.UserDao;
import com.lirh.login.pojo.User;
import com.lirh.login.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServerImpl implements UserServer {
    @Autowired
    private UserDao userDao=null;
    @Override
    public User getUser(String username, String pwd) {
        return userDao.getUser(username,pwd);
    }
}
