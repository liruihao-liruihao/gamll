package com.lirh.login.controller;

import com.lirh.login.pojo.User;
import com.lirh.login.server.UserServer;
import com.lirh.login.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
public class LoginController {

    @Autowired
    public RedisTemplate redisTemplate=null;
    @Autowired
    public UserServer userServer=null;
    @PostMapping("/login")
    public Result login(@RequestBody User user){
        System.out.println(user.toString());
        User user1 = userServer.getUser(user.getUsername(), user.getPwd());

        if (user1!=null){//登录成功
            String token= UUID.randomUUID().toString();//token有很多生成方式，我这里使用的是uuid
            redisTemplate.opsForValue().set(token,user1,5,TimeUnit.MINUTES);//tokin存入reidsz中
            return new Result(200,"登陆成功",token);
        }else{
            Result result = new Result();
            result.setStatus(201);
            result.setMessage("登陆失败");
            return result;
        }

    }

    @GetMapping("/logout")
    public Result logout(HttpServletRequest request,HttpServletResponse response){
        String token = request.getHeader("token");
        Boolean delete = redisTemplate.delete(token);
        return new Result(100,"注销成功",delete);

    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Login";
    }

}
