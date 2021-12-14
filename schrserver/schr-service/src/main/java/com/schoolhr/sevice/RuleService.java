package com.schoolhr.sevice;


import com.schoolhr.mapper.RuleMapper;
import com.schoolhr.model.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RuleService {
    @Autowired
    RuleMapper ruleMapper;

    public List<Rule> getAllRules() {
        return ruleMapper.getAllRules();
    }

    public Integer addRule(Rule rule) {
        //       手动赋值
        rule.setCreateDate(new Date());
        rule.setEnabled(true);
        return ruleMapper.insertSelective(rule);
    }

    public Integer updateRuleById(Rule rule) {
        return ruleMapper.updateByPrimaryKeySelective(rule);
    }

    public Integer deleteRuleById(Integer id) {
        return ruleMapper.deleteByPrimaryKey(id);
    }

    public Integer deleteRulesByIds(Integer[] ids) {
        return ruleMapper.deleteRulesByIds(ids);
    }

    //   查询单条记录的相关信息（通过名字）
    public List<Rule> selectRule(Rule rule) {
        return ruleMapper.selectByRuleName(rule);
    }

    //  查询已启用的规则
    public List<Rule> getAllEnabledRules() {
        return ruleMapper.getAllEnabledRules();
    }
}
