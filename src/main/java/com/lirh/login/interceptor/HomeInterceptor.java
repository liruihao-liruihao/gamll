package com.lirh.login.interceptor;

import com.lirh.login.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

public class HomeInterceptor implements HandlerInterceptor {
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
      if (token==null){
          token="123";
      }
        Long expire = redisTemplate.getExpire(token);
        if (expire>0){
            redisTemplate.expire(token,5,TimeUnit.MINUTES);
            return  true;
        }else{
            response.getWriter().write("{\"status\":102}");
            return false;
        }

    }
}
