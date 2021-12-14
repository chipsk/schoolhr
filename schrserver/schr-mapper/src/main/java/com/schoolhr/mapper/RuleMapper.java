package com.schoolhr.mapper;

import com.schoolhr.model.Rule;

import java.util.List;

public interface RuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rule record);

    int insertSelective(Rule record);

    Rule selectByPrimaryKey(Integer id);

    List<Rule> selectByRuleName(Rule rule);

    int updateByPrimaryKeySelective(Rule record);

    int updateByPrimaryKey(Rule record);

    List<Rule> getAllRules();

    Integer deleteRulesByIds(Integer[] ids);

    List<Rule> getAllEnabledRules();
}