package com.wgs.blog.dao.blog;

import com.wgs.blog.entity.blog.LabelDo;

public interface LabelDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LabelDo record);

    int insertSelective(LabelDo record);

    LabelDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LabelDo record);

    int updateByPrimaryKey(LabelDo record);
}