package com.schoolhr.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {
    private int id;

    private String name;

    private String address;
    private int parentId;
    private String depPath;
    private int enabled;
    private int isParent;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getParentId() {
        return parentId;
    }

    public String getDepPath() {
        return depPath;
    }

    public int getEnabled() {
        return enabled;
    }

    public int getIsParent() {
        return isParent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public void setDepPath(String depPath) {
        this.depPath = depPath;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public void setIsParent(int isParent) {
        this.isParent = isParent;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", parentId=" + parentId +
                ", depPath='" + depPath + '\'' +
                ", enabled=" + enabled +
                ", isParent=" + isParent +
                '}';
    }
    //    @Override
//    public boolean equals(Object o) {
//
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Department that = (Department) o;
//        return Objects.equals(username, that.username);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(username);
//    }




}
