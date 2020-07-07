package com.wgs.blog.service;


import com.wgs.blog.entity.blog.UserDo;

public interface UserService {

    public UserDo existUser(UserDo user);
    public UserDo selectById(int id);
}
