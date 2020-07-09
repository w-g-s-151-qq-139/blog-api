package com.wgs.blog.controller;

import com.wgs.blog.entity.blog.ResultData;
import com.wgs.blog.entity.blog.UserDo;
import com.wgs.blog.service.UserService;
import com.wgs.blog.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.Map;


@Api(tags = "用户个人中心模块")
@RestController
@CrossOrigin(allowCredentials = "true", origins = {"http://localhost:8080"}, methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.OPTIONS})
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;


    @ApiOperation(value = "查询用户详细信息")
    @RequestMapping("/userInfo")
    public ResultData userInfo(HttpServletRequest request, HttpServletResponse response,   UserDo user){
        String access_token = (String)request.getAttribute("access_token");
        UserDo userDo = userService.selectById(user.getId());
        Map data = new HashMap();
        data.put("user", userDo);
        data.put("access_token", access_token);
        return ResultUtil.getResultData("200", "查询成功", data);
    }

    @ApiOperation(value = "修改头像")
    @RequestMapping("/alterHeadPic")
    public ResultData alterHeadPic(HttpServletRequest request, HttpServletResponse response,   MultipartFile pic){
        String access_token = (String)request.getAttribute("access_token");
        Map data = new HashMap();
        data.put("access_token", access_token);
        //文件上传
        if (!pic.isEmpty()) {
            try {
                //图片命名
                String originalFilename = pic.getOriginalFilename();
                int lastIndexOf = originalFilename.lastIndexOf(".");
                String filename = System.currentTimeMillis() + originalFilename.substring(lastIndexOf, originalFilename.length());
                String newCompanyImagepath = "D:\\WebStorm 2020.1.1\\blog2\\src\\assets\\upload\\" +filename;
                //String newCompanyImagepath = "/root/java/blogPic/" +filename;
                data.put("filename", filename);
                File newFile = new File(newCompanyImagepath);
                if (!newFile.exists()) {
                    newFile.createNewFile();
                }
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(newFile));
                out.write(pic.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return ResultUtil.getResultData("200", "文件未找到", null);
            } catch (IOException e) {
                e.printStackTrace();
                return ResultUtil.getResultData("200", "io异常，上传失败", null);
            }
        }

        return ResultUtil.getResultData("200", "修改头像成功", data);
    }


}
