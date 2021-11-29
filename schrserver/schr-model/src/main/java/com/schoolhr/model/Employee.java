package com.schoolhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private Integer id;
    private String userID;
    private String username;
    private String userSex;
    private String idCard;
    private String politic;
    private String phone;
    private String address;
    private String basisSalary;
    private String workstatus;
    private String e_mail;
    private Integer departmentid;
    private String joblevel;
    private Integer positionid;
    private String dname;
    private String posname;
    private String accountName;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getPosname() {
        return posname;
    }

    public void setPosname(String posname) {
        this.posname = posname;
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date birthday;


    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Double contractTime;


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }



    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date beginworkDate;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date endworkDate;

    public String getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
    }

    public Integer getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getUserSex() {
        return userSex;
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

    public String getBasisSalary() {
        return basisSalary;
    }



    public int getDepartmentid() {
        return departmentid;
    }

    public String getJoblevel() {
        return joblevel;
    }

    public Double getContractTime() {
        return contractTime;
    }

    public Date getBeginworkDate() {
        return beginworkDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
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

    public void setBasisSalary(String basisSalary) {
        this.basisSalary = basisSalary;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setJoblevel(String joblevel) {
        this.joblevel = joblevel;
    }

    public void setBeginworkDate(Date beginworkDate) {
        this.beginworkDate = beginworkDate;
    }

    public void setContractTime(Double contractTime) {
        this.contractTime = contractTime;
    }

    public Date getEndworkDate() {
        return endworkDate;
    }

    public void setEndworkDate(Date endworkDate) {
        this.endworkDate = endworkDate;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", userID='" + userID + '\'' +
                ", username='" + username + '\'' +
                ", userSex='" + userSex + '\'' +
                ", idCard='" + idCard + '\'' +
                ", politic='" + politic + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", basisSalary='" + basisSalary + '\'' +
                ", workstatus='" + workstatus + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", departmentid=" + departmentid +
                ", joblevel='" + joblevel + '\'' +
                ", positionid=" + positionid +
                ", birthday=" + birthday +
                ", contractTime=" + contractTime +
                ", beginworkDate=" + beginworkDate +
                ", endworkDate=" + endworkDate +
                '}';
    }

    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }
}

