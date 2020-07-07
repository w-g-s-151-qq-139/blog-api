package com.wgs.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @MapperScan("com/wgs/blog.dao") 配置dao包扫描
 * @EnableTransactionManagement 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
 */

@EnableTransactionManagement
@ServletComponentScan
@SpringBootApplication
@MapperScan("com/wgs/blog.dao.blog")
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
