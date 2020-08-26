package com.lirh.login.server;

import com.lirh.login.pojo.User;

public interface UserServer {
    public User getUser(String username,String pwd);
}
