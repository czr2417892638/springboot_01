package com.tx.demo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * tbl_emp
 * @author 
 */
public class TblEmp implements Serializable {
    private Integer eId;

    private String eName;

    private String eGongzuo;

    private Float eGongzi;

    private Date eTime;

    private Float eQian;

    private static final long serialVersionUID = 1L;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteGongzuo() {
        return eGongzuo;
    }

    public void seteGongzuo(String eGongzuo) {
        this.eGongzuo = eGongzuo;
    }

    public Float geteGongzi() {
        return eGongzi;
    }

    public void seteGongzi(Float eGongzi) {
        this.eGongzi = eGongzi;
    }

    public Date geteTime() {
        return eTime;
    }

    public void seteTime(Date eTime) {
        this.eTime = eTime;
    }

    public Float geteQian() {
        return eQian;
    }

    public void seteQian(Float eQian) {
        this.eQian = eQian;
    }
}