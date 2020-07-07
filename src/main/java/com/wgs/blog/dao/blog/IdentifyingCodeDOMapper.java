package com.wgs.blog.dao.blog;

import com.wgs.blog.entity.blog.IdentifyingCodeDO;

public interface IdentifyingCodeDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IdentifyingCodeDO record);

    int insertSelective(IdentifyingCodeDO record);

    IdentifyingCodeDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IdentifyingCodeDO record);

    int updateByPrimaryKey(IdentifyingCodeDO record);
}