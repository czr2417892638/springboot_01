package com.tx.demo.pojo;

import java.io.Serializable;

/**
 * tbl_dept
 * @author 
 */
public class TblDept implements Serializable {
    private Integer dId;

    private String dName;

    private Integer eId;

    private static final long serialVersionUID = 1L;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }
}