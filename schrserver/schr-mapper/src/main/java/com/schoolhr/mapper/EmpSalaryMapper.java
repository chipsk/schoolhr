package com.schoolhr.mapper;

import com.schoolhr.model.EmpWithSalary;

public interface EmpSalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmpWithSalary record);

    int insertSelective(EmpWithSalary record);

    EmpWithSalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmpWithSalary record);

    int updateByPrimaryKey(EmpWithSalary record);
}