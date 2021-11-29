package com.schoolhr.model.Personnel;

public class AllEmpDepartment {
    private Integer id;
    private Integer userID;
    private String username;
    private int departmentid;
    public Integer getId() {
        return id;
    }
    public Integer getUserID() {
        return userID;
    }
    public String getUsername() {
        return username;
    }
    public int getDepartmentid() {
        return departmentid;
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
    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }
    @Override
    public String toString() {
        return "AllEmpDepartment{" +
                "id=" + id +
                ", userID=" + userID +
                ", username='" + username + '\'' +
                ", departmentid=" + departmentid +
                '}';
    }
}
