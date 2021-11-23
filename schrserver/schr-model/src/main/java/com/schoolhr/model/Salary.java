package com.schoolhr.model;
import java.util.Date;

public class Salary {
    private Integer uid;
    private Integer userID;
    private String username;
    private Integer departmentid;
    private Integer basisSalary;
    private String allSalary;
    private String bonus;
    private Date date;
    private String remark;

    public Integer getUid() {
        return uid;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public Integer getBasisSalary() {
        return basisSalary;
    }

    public String getAllSalary() {
        return allSalary;
    }

    public String getBonus() {
        return bonus;
    }

    public Date getDate() {
        return date;
    }

    public String getRemark() {
        return remark;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public void setBasisSalary(Integer basisSalary) {
        this.basisSalary = basisSalary;
    }

    public void setAllSalary(String allSalary) {
        this.allSalary = allSalary;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
