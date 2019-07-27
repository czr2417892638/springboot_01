package com.tx.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tx.demo.vo.EmpAllVo;

public interface EmpAllDAO {
	List<EmpAllVo> selectall();

	List<EmpAllVo> selectbyid(@Param("eid") Integer eid);

	int delbyid(@Param("eid") Integer eid);
}
