package com.schoolhr.mapper;


import com.schoolhr.model.SalaryAccount;

import java.util.List;

public interface SalaryAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SalaryAccount record);

    int insertSelective(SalaryAccount record);

    SalaryAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SalaryAccount record);

    int updateByPrimaryKey(SalaryAccount record);

    List<SalaryAccount> getAllSalaryAccounts();
}
