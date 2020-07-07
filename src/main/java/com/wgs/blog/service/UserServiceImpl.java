package com.wgs.blog.service;

import com.wgs.blog.dao.blog.UserDoMapper;
import com.wgs.blog.entity.blog.UserDo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Transactional 配置支持事务
 */
@Service
//@Transactional
public class UserServiceImpl implements UserService{

    @Resource
    UserDoMapper userDoMapper;

    @Override
    public UserDo existUser(UserDo user) {

        //UserDo userDo = userDoMapper.selectByUser(user);
        return userDoMapper.selectByUser(user);
    }

    @Override
    public UserDo selectById(int id) {
        return userDoMapper.selectByPrimaryKey(id);
    }
}
