package com.lirh.login;

import com.lirh.login.dao.UserDao;
import com.lirh.login.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class LoginApplicationTests {
    @Autowired
    public RedisTemplate redisTemplate=null;

    @Autowired
    private UserDao userDao=null;
    @Test
    void contextLoads() {
        User uu = userDao.getUser("lisi", "123456");
        System.out.println(uu);
        redisTemplate.opsForValue().set("lilili",uu);

    }

}
