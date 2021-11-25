package com.schoolhr.model.Personnel;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class EmpInfo {
    private Integer id;
    private Integer userID;
    private String username;
    private String userSex;
    private String IDcard;
    private String politic;
    private String phone;
    private String address;
    private Integer basisSalary;
    private String workstatus;
    private String E_mail;
    private int departmentid;
    private String joblevel;
    private Integer contractTime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date beginworkDate;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date birthday;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date endworkDate;
    private int positionid;

    public int getPositionid() {
        return positionid;
    }

    public void setPositionid(int positionid) {
        this.positionid = positionid;
    }

    public String getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getIDcard() {
        return IDcard;
    }

    public String getPolitic() {
        return politic;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Integer getBasisSalary() {
        return basisSalary;
    }

    public Date getBirthday() {
        return birthday;
    }


    public Date getEndworkDate() {
        return endworkDate;
    }

    public String getE_mail() {
        return E_mail;
    }

    public int getDepartmentid() {
        return departmentid;
    }

    public String getJoblevel() { return joblevel; }

    public Integer getContractTime() {
        return contractTime;
    }

    public Date getBeginworkDate() {
        return beginworkDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public void setPolitic(String politic) {
        this.politic = politic;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBasisSalary(Integer basisSalary) {
        this.basisSalary = basisSalary;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }

    public void setJoblevel(String joblevel) {
        this.joblevel = joblevel;
    }

    public void setContractTime(Integer contractTime) {
        this.contractTime = contractTime;
    }

    public void setBeginworkDate(Date beginworkDate) {
        this.beginworkDate = beginworkDate;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setEndworkDate(Date endworkDate) {
        this.endworkDate = endworkDate;
    }

    @Override
    public String toString() {
        return "EmpInfo{" +
                "id=" + id +
                ", userID=" + userID +
                ", username='" + username + '\'' +
                ", userSex='" + userSex + '\'' +
                ", IDcard='" + IDcard + '\'' +
                ", politic='" + politic + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", basisSalary=" + basisSalary +
                ", workstatus='" + workstatus + '\'' +
                ", E_mail='" + E_mail + '\'' +
                ", departmentid=" + departmentid +
                ", joblevel='" + joblevel + '\'' +
                ", contractTime=" + contractTime +
                ", beginworkDate=" + beginworkDate +
                ", birthday=" + birthday +
                ", endworkDate=" + endworkDate +
                ", positionid=" + positionid +
                '}';
    }
}

