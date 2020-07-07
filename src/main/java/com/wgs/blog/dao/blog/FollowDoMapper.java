package com.wgs.blog.dao.blog;

import com.wgs.blog.entity.blog.FollowDo;

public interface FollowDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FollowDo record);

    int insertSelective(FollowDo record);

    FollowDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FollowDo record);

    int updateByPrimaryKey(FollowDo record);
}