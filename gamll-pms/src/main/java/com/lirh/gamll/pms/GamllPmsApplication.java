package com.lirh.gamll.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、配置整合dubbo
 * 2、配置整合mybatisplus
 */
@EnableDubbo
@MapperScan(basePackages = "com.lirh.gamll.pms.mapper")
@SpringBootApplication
public class GamllPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamllPmsApplication.class, args);
    }

}
