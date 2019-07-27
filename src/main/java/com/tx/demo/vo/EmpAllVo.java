package com.tx.demo.vo;

import java.util.Date;

public class EmpAllVo {
	// 部门表
	private Integer d_id;
	private String d_name;
	private Integer e_ids;
	// 员工表
	private Integer e_id;
	private String e_name;
	private String e_gongzuo;
	private Float e_gongzi;
	private Date e_time;
	private Float e_qian;

	public Integer getD_id() {
		return d_id;
	}

	public void setD_id(Integer d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public Integer getE_ids() {
		return e_ids;
	}

	public void setE_ids(Integer e_ids) {
		this.e_ids = e_ids;
	}

	public Integer getE_id() {
		return e_id;
	}

	public void setE_id(Integer e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getE_gongzuo() {
		return e_gongzuo;
	}

	public void setE_gongzuo(String e_gongzuo) {
		this.e_gongzuo = e_gongzuo;
	}

	public Float getE_gongzi() {
		return e_gongzi;
	}

	public void setE_gongzi(Float e_gongzi) {
		this.e_gongzi = e_gongzi;
	}

	public Date getE_time() {
		return e_time;
	}

	public void setE_time(Date e_time) {
		this.e_time = e_time;
	}

	public Float getE_qian() {
		return e_qian;
	}

	public void setE_qian(Float e_qian) {
		this.e_qian = e_qian;
	}

}
