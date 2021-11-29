package com.schoolhr.model.Personnel;

public class EmpSalary {
    private Integer id;
    private Integer userID;
    private String username;
    private Integer basisSalary;

    public Integer getId() {
        return id;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public Integer getBasisSalary() {
        return basisSalary;
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

    public void setBasisSalary(Integer basisSalary) {
        this.basisSalary = basisSalary;
    }

    @Override
    public String toString() {
        return "EmpSalary{" +
                "id=" + id +
                ", userID=" + userID +
                ", username='" + username + '\'' +
                ", basisSalary=" + basisSalary +
                '}';
    }
}
