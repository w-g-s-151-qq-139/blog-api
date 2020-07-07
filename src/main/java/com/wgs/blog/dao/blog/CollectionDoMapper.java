package com.wgs.blog.dao.blog;

import com.wgs.blog.entity.blog.CollectionDo;

public interface CollectionDoMapper {
    int deleteByPrimaryKey(String id);

    int insert(CollectionDo record);

    int insertSelective(CollectionDo record);

    CollectionDo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CollectionDo record);

    int updateByPrimaryKey(CollectionDo record);
}