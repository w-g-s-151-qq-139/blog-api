package com.wgs.blog.utils;

import com.wgs.blog.config.JwtConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TokenUtils {
    /**
     * 更新token，token未过期并且30秒内将过期时生成新的token
     * @param request
     * @param tokenName
     * @param jwtConfig
     */
    public static String updateToken(HttpServletRequest request, HttpServletResponse response,
                                     String tokenName, JwtConfig jwtConfig,RedisUtil redisUtil){
        String token = redisUtil.get(tokenName);

        return token;
    }
}
