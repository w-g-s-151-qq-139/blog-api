package com.wgs.blog.dao.blog;

import com.wgs.blog.entity.blog.MessageDo;

public interface MessageDoMapper {
    int deleteByPrimaryKey(String id);

    int insert(MessageDo record);

    int insertSelective(MessageDo record);

    MessageDo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MessageDo record);

    int updateByPrimaryKey(MessageDo record);
}