package com.wgs.blog.dao.blog;

import com.wgs.blog.entity.blog.CommentDo;

public interface CommentDoMapper {
    int deleteByPrimaryKey(String id);

    int insert(CommentDo record);

    int insertSelective(CommentDo record);

    CommentDo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CommentDo record);

    int updateByPrimaryKey(CommentDo record);
}