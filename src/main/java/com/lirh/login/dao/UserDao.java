package com.lirh.login.dao;

import com.lirh.login.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public User getUser(@Param("username")String username,@Param("pwd") String pwd);
}
