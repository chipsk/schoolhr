package com.schoolhr.model.Personnel;

public class EmpMove {
    private int id;
    private String userID;
    private String username;
    private String workstatus;
    private String departmentname;
    private int departmentid;
    private String joblevel;
    private String positionname;
    private int positionid;

    public int getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getWorkstatus() {
        return workstatus;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public int getDepartmentid() {
        return departmentid;
    }

    public String getJoblevel() {
        return joblevel;
    }

    public String getPositionname() {
        return positionname;
    }

    public int getPositionid() {
        return positionid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public void setJoblevel(String joblevel) {
        this.joblevel = joblevel;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }

    public void setPositionid(int positionid) {
        this.positionid = positionid;
    }

    @Override
    public String toString() {
        return "EmpMove{" +
                "id=" + id +
                ", userID='" + userID + '\'' +
                ", username='" + username + '\'' +
                ", workstatus='" + workstatus + '\'' +
                ", departmentname='" + departmentname + '\'' +
                ", departmentid=" + departmentid +
                ", joblevel='" + joblevel + '\'' +
                ", positionname='" + positionname + '\'' +
                ", positionid=" + positionid +
                '}';
    }
}
