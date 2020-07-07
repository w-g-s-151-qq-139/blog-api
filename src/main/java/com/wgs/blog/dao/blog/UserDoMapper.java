package com.wgs.blog.dao.blog;

import com.wgs.blog.entity.blog.UserDo;

public interface UserDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDo record);

    int insertSelective(UserDo record);

    UserDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDo record);

    int updateByPrimaryKey(UserDo record);

    UserDo selectByUser(UserDo user);
}