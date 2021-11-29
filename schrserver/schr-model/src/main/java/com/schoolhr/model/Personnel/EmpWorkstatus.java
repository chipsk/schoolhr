package com.schoolhr.model.Personnel;

public class EmpWorkstatus {
    private Integer id;
    private Integer userID;
    private String username;
    private String workstatus;
    public Integer getId() {
        return id;
    }
    public Integer getUserID() {
        return userID;
    }
    public String getUsername() {
        return username;
    }
    public String getWorkstatus() {
        return workstatus;
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
    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
    }
    @Override
    public String toString() {
        return "EmpWorkstatus{" +
                "id=" + id +
                ", userID=" + userID +
                ", username='" + username + '\'' +
                ", workstatus='" + workstatus + '\'' +
                '}';
    }
}
