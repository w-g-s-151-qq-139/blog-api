package com.wgs.blog.filter;

import com.alibaba.fastjson.JSONObject;
import com.wgs.blog.config.JwtConfig;
import com.wgs.blog.entity.blog.UserDo;
import com.wgs.blog.service.UserService;
import com.wgs.blog.utils.RedisUtil;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import org.springframework.data.redis.core.RedisTemplate;
/**
 * @Configuration 和 @WebFilter 缺一不可
 */


@WebFilter(urlPatterns = "/user/*", filterName = "loginFilter")
public class LoginFilter implements Filter {

    UserService userService;
    JwtConfig jwtConfig;
    RedisUtil redisUtil;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ServletContext servletContext = filterConfig.getServletContext();
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        userService = webApplicationContext.getBean(UserService.class);
        jwtConfig = webApplicationContext.getBean(JwtConfig.class);
        redisUtil = webApplicationContext.getBean(RedisUtil.class);
        redisUtil.setRedisTemplate(webApplicationContext.getBean("redisTemplate",RedisTemplate.class));
    }

    /*
        1.获取token
        2.判断token值是否为null或空字符串，是则跳转登录页面
        3.获取JwtConfig对象bean、UserService对象bean、RedisUtil对象bean
        4.获取token的过期时间，token中用户信息，获取refresh_token
        5.判断用户信息是否正确，否则跳转登录页面
        6.判断token是否过期，过期则判断refresh_token是否过期，也过期则跳转登录页面，否则重新生成access_token和refresh_token
     */

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String access_token = request.getHeader("Authorization");

        if(null == access_token || "" == access_token){
            request.getRequestDispatcher("/loginExpired").forward(servletRequest,servletResponse);
            return;
        }

        try{
            Date expirationDateFromToken = jwtConfig.getExpirationDateFromToken(access_token);
            UserDo userDo = JSONObject.parseObject(jwtConfig.getUsernameFromToken(access_token), UserDo.class);
            if(userService.existUser(userDo) == null){
                request.getRequestDispatcher("/loginExpired").forward(servletRequest,servletResponse);
                return;
            }
            request.setAttribute("access_token", access_token);
        }catch (Exception e){

            String userId = request.getParameter("id");
            String refresh_token = redisUtil.get("refresh_token_" + userId);

            try {

                Date refreshExpirationDateFromToken = jwtConfig.getExpirationDateFromToken(refresh_token);

                UserDo userDo = JSONObject.parseObject(jwtConfig.getUsernameFromToken(refresh_token), UserDo.class);
                String access_token_new = jwtConfig.createToken(JSONObject.toJSONString(userDo), 3000);
                String refresh_token_new = jwtConfig.createToken(JSONObject.toJSONString(userDo), 3600);
                redisUtil.set("refresh_token_" + userId,refresh_token_new);

                request.setAttribute("access_token", access_token_new);
            }catch (Exception e1){

                request.getRequestDispatcher("/loginExpired").forward(servletRequest,servletResponse);
                return;
            }
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

}
