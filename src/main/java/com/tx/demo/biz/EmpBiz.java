package com.tx.demo.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tx.demo.dao.EmpAllDAO;
import com.tx.demo.vo.EmpAllVo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class EmpBiz {
	@Autowired
	private EmpAllDAO dao1;

	public PageInfo<EmpAllVo> selectall(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<EmpAllVo>(dao1.selectall());
	}

	public List<EmpAllVo> selectbyid(Integer eid) {
		return dao1.selectbyid(eid);
	}

	public int delbyid(Integer eid) {
		return dao1.delbyid(eid);
	}
}
