package com.smy.chapter2.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smy.chapter2.model.MUser;

import java.util.List;


public interface MUserMapper extends BaseMapper<MUser> {
    int deleteByPrimaryKey(String id);

    int insert(MUser record);

    int insertSelective(MUser record);

    MUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MUser record);

    int updateByPrimaryKey(MUser record);
    
    List<MUser> getAll();
}