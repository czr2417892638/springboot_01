package com.tx.demo.dao;

import com.tx.demo.pojo.TblDept;

public interface TblDeptDAO {
    int deleteByPrimaryKey(Integer dId);

    int insert(TblDept record);

    int insertSelective(TblDept record);

    TblDept selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(TblDept record);

    int updateByPrimaryKey(TblDept record);
}