package com.wgs.blog.controller;

import com.alibaba.fastjson.JSONObject;
import com.wgs.blog.config.JwtConfig;
import com.wgs.blog.entity.blog.ResultData;
import com.wgs.blog.entity.blog.UserDo;
import com.wgs.blog.service.UserService;

import com.wgs.blog.utils.Md5Utils;
import com.wgs.blog.utils.RedisUtil;

import com.wgs.blog.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;
import java.util.Map;


/**
 * @CrossOrigin 跨域配置
 */
@Api(tags = "用户登录注册模块")
@RestController
@CrossOrigin(allowCredentials = "true", origins = "http://localhost:8080")
public class LoginController {

    @Resource
    UserService userService;
    @Resource
    private JwtConfig jwtConfig;
    @Resource
    private RedisUtil redisUtil;

    @ApiOperation(value = "登录",response = ResultData.class,httpMethod = "POST")
    @RequestMapping("/login")
    public ResultData login(HttpServletRequest request, HttpServletResponse response, UserDo user){
        user.setPassword(Md5Utils.encodeByMD5(user.getPassword()));
        UserDo userDo = userService.existUser(user);
        if(null == userDo){
            return ResultUtil.getResultData("200","账号密码错误",null);
        }

        String userJson = JSONObject.toJSONString(userDo);
        String access_token = jwtConfig.createToken(userJson,3000);
        String refresh_token = jwtConfig.createToken(userJson,3600);

        redisUtil.set("refresh_token_"+userDo.getId(),refresh_token);
        Map resultData = new HashMap<>();
        resultData.put("user",userDo);
        resultData.put("access_token",access_token);

        return ResultUtil.getResultData("200", "登录成功", resultData);
    }

    @ApiOperation(value = "退出账号",response = ResultData.class,httpMethod = "POST")
    @RequestMapping("/userExit")
    public ResultData userExit(UserDo user){
        redisUtil.delete("refresh_token_"+user.getId());
        return ResultUtil.getResultData("200", "成功退出账号", null);
    }

    @ApiOperation(value = "登录过期",response = ResultData.class,httpMethod = "POST")
    @RequestMapping("/loginExpired")
    public ResultData loginExpired(UserDo user){
        redisUtil.delete("refresh_token_"+user.getId());
        return ResultUtil.getResultData("401", "登录过期", null);
    }


}
