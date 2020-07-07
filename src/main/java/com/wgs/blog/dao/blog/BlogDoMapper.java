package com.wgs.blog.dao.blog;

import com.wgs.blog.entity.blog.BlogDo;

public interface BlogDoMapper {
    int deleteByPrimaryKey(String id);

    int insert(BlogDo record);

    int insertSelective(BlogDo record);

    BlogDo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BlogDo record);

    int updateByPrimaryKeyWithBLOBs(BlogDo record);

    int updateByPrimaryKey(BlogDo record);
}