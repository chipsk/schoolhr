package com.schoolhr.schrweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "com.schoolhr.mapper")
@ComponentScan(basePackages = "com.schoolhr")
@EnableScheduling
public class SchrWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchrWebApplication.class, args);
    }

}
