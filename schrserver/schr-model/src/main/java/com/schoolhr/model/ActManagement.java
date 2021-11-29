package com.schoolhr.model;

public class ActManagement {
    private int id;
    private String username;
    private String Action;
    private String Table;
    private String SpecificAction;
    private String ActionTime;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getAction() {
        return Action;
    }

    public String getTable() {
        return Table;
    }

    public String getSpecificAction() {
        return SpecificAction;
    }

    public String getActionTime() {
        return ActionTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAction(String action) {
        Action = action;
    }

    public void setTable(String table) {
        Table = table;
    }

    public void setSpecificAction(String specificAction) {
        SpecificAction = specificAction;
    }

    public void setActionTime(String actionTime) {
        ActionTime = actionTime;
    }

    @Override
    public String toString() {
        return "ActManagement{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", Action='" + Action + '\'' +
                ", Table='" + Table + '\'' +
                ", SpecificAction='" + SpecificAction + '\'' +
                ", ActionTime='" + ActionTime + '\'' +
                '}';
    }
}
