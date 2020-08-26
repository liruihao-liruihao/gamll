package com.lirh.login.controller;

import com.lirh.login.pojo.User;
import com.lirh.login.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    public RedisTemplate redisTemplate=null;
    @GetMapping("/user")
    public Object getUser(HttpServletRequest request){
        String token = request.getHeader("token");
        System.out.println(token);
        Object o = redisTemplate.opsForValue().get(token);

        return new Result(200,"查询成功",o);
    }

}
