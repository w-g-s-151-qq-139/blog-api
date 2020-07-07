package com.wgs.blog;

import com.wgs.blog.config.JwtConfig;
import com.wgs.blog.utils.Md5Utils;
import com.wgs.blog.utils.RedisUtil;
import org.assertj.core.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisTest {
    @Resource
    private RedisUtil redisUtils;
    @Resource
    private JwtConfig jwtConfig;

    /**
     * 插入缓存数据
     */
    @Test
    public void set() {
//        String token = jwtConfig.createToken("1");
//        Date expirationDateFromToken = jwtConfig.getExpirationDateFromToken(token);
//        System.out.println(DateUtil.timeDifference(expirationDateFromToken,DateUtil.now()));
        //redisUtils.setHaveTheTime("redis_key", "redis_vale", 60, TimeUnit.SECONDS);
    }

    /**
     * 读取缓存数据
     */
    @Test
    public void get() {
        String value = redisUtils.get("refresh_token_2");
        System.out.println(value+"/n缓存");
    }

    @Test
    public void delete(){
        System.out.println(redisUtils.delete("redis_key"));
    }

    @Test
    public void md5Test(){
        System.out.println(Md5Utils.encodeByMD5("wgs151qq139").length());
    }

    @Test
    public void token(){
        System.out.println(jwtConfig.createToken("111", 60));
    }

    @Test
    public void token1(){
        System.out.println(jwtConfig.getTokenClaim("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxMTEiLCJpYXQiOjE1OTIyMDg1MjIsImV4cCI6MTU5MjIwODU4Mn0.rIpW2syGkEHev7V2JHm396kZbM6NkYuLk2nxVN4XqT_7s7nD6HJ1_gMieGU5NK73TyHilr7dVH72d4EK--HRFA").isEmpty());
    }

}
