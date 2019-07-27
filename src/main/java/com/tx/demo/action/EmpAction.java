package com.tx.demo.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.tx.demo.biz.EmpBiz;
import com.tx.demo.vo.EmpAllVo;

@RestController
@RequestMapping("/api/emps")
public class EmpAction {
	@Autowired
	private EmpBiz biz;

	@GetMapping("queryall/{num}/{size}")
	public PageInfo<EmpAllVo> querybyall(@PathVariable Integer num, @PathVariable Integer size) {
		return biz.selectall(num, size);
	}

	@GetMapping("queryid/{eid}")
	public List<EmpAllVo> querybyid(@PathVariable Integer eid) {
		return biz.selectbyid(eid);
	}

	@DeleteMapping("delid/{eid}")
	public Map<String, String> delbyid(@PathVariable Integer eid) {
		Map<String, String> message = new HashMap<String, String>();
		biz.delbyid(eid);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
}
