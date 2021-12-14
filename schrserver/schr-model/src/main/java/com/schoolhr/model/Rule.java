package com.schoolhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Rule {
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    private String ruleName;

    private Integer ruleValue;

    private Boolean enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public Integer getRuleValue() {
        return ruleValue;
    }

    public void setRuleValue(Integer ruleValue) {
        this.ruleValue = ruleValue;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}