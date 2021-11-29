package com.schoolhr.model;

public class EmpAdvanced {
    private Integer id;
    private Integer userID;
    private String username;
    private String E_mail;
    private String job;
    private String graduateSchool;
    private String achievement;

    public Integer getId() {
        return id;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getE_mail() {
        return E_mail;
    }

    public String getJob() {
        return job;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public String getAchievement() {
        return achievement;
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

    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    @Override
    public String toString() {
        return "AdvancedDate{" +
                "id=" + id +
                ", userID=" + userID +
                ", username='" + username + '\'' +
                ", E_mail='" + E_mail + '\'' +
                ", job='" + job + '\'' +
                ", graduateSchool='" + graduateSchool + '\'' +
                ", achievement='" + achievement + '\'' +
                '}';
    }
}
