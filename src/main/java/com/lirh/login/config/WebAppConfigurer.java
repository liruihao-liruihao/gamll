package com.lirh.login.config;

import com.lirh.login.interceptor.HomeInterceptor;
import com.lirh.login.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("**********************************************");
        registry.addInterceptor(loginInterceptor())
                .addPathPatterns("/**");
        registry.addInterceptor( homeInterceptor())
                .addPathPatterns("/home/**");
    }

    @Bean
    public LoginInterceptor loginInterceptor(){
        return new LoginInterceptor();
    }
    @Bean
    public HomeInterceptor homeInterceptor(){
        return  new HomeInterceptor();
    }



}
