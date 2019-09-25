package com.generate.dao;

import com.generate.pojo.GStupro;

public interface GStuproMapper {
    int deleteByPrimaryKey(Integer stuproid);

    int insert(GStupro record);

    int insertSelective(GStupro record);

    GStupro selectByPrimaryKey(Integer stuproid);

    int updateByPrimaryKeySelective(GStupro record);

    int updateByPrimaryKey(GStupro record);
}