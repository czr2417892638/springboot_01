package com.tx.demo.dao;

import com.tx.demo.pojo.TblEmp;

public interface TblEmpDAO {
    int deleteByPrimaryKey(Integer eId);

    int insert(TblEmp record);

    int insertSelective(TblEmp record);

    TblEmp selectByPrimaryKey(Integer eId);

    int updateByPrimaryKeySelective(TblEmp record);

    int updateByPrimaryKey(TblEmp record);
}