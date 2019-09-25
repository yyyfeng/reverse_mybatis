package com.generate.dao;

import com.generate.pojo.GStudent;

public interface GStudentMapper {
    int deleteByPrimaryKey(Integer stuid);

    int insert(GStudent record);

    int insertSelective(GStudent record);

    GStudent selectByPrimaryKey(Integer stuid);

    int updateByPrimaryKeySelective(GStudent record);

    int updateByPrimaryKey(GStudent record);
}