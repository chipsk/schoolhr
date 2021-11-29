package com.schoolhr.model;

import java.util.Date;

public class SalaryAccount {
    private Integer id;

    private Integer basisSalary;

    private String bonus;

    private Integer lunchSalary;

    private Integer trafficSalary;

    private String allSalary;

    private Integer socialBase;

    private Float socialPer;

    private Date createDate;

    private Integer medicalBase;

    private Float medicalPer;

    private Integer accumulationFundBase;

    private Float accumulationFundPer;

    private String name;

    private int departmentid;

    public int getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBasisSalary() {
        return basisSalary;
    }

    public void setBasisSalary(Integer basisSalary) {
        this.basisSalary = basisSalary;
    }

    public Integer getLunchSalary() {
        return lunchSalary;
    }

    public void setLunchSalary(Integer lunchSalary) {
        this.lunchSalary = lunchSalary;
    }

    public Integer getTrafficSalary() {
        return trafficSalary;
    }

    public void setTrafficSalary(Integer trafficSalary) {
        this.trafficSalary = trafficSalary;
    }


    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getAllSalary() {
        return allSalary;
    }

    public void setAllSalary(String allSalary) {
        this.allSalary = allSalary;
    }

    public Integer getSocialBase() {
        return socialBase;
    }

    public void setSocialBase(Integer socialBase) {
        this.socialBase = socialBase;
    }

    public Float getSocialPer() {
        return socialPer;
    }

    public void setSocialPer(Float socialPer) {
        this.socialPer = socialPer;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getMedicalBase() {
        return medicalBase;
    }

    public void setMedicalBase(Integer medicalBase) {
        this.medicalBase = medicalBase;
    }

    public Float getMedicalPer() {
        return medicalPer;
    }

    public void setMedicalPer(Float medicalPer) {
        this.medicalPer = medicalPer;
    }

    public Integer getAccumulationFundBase() {
        return accumulationFundBase;
    }

    public void setAccumulationFundBase(Integer accumulationFundBase) {
        this.accumulationFundBase = accumulationFundBase;
    }

    public Float getAccumulationFundPer() {
        return accumulationFundPer;
    }

    public void setAccumulationFundPer(Float accumulationFundPer) {
        this.accumulationFundPer = accumulationFundPer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
