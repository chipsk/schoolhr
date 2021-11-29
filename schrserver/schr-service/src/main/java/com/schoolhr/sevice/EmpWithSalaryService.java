package com.schoolhr.sevice;

import com.schoolhr.mapper.EmpWithSalaryMapper;
import com.schoolhr.model.SalaryAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmpWithSalaryService {
    @Autowired
    EmpWithSalaryMapper empWithSalaryMapper;

    public List<SalaryAccount> getAllSalaryAccounts() {
        return empWithSalaryMapper.getAllSalaryAccounts();
    }

    public Integer addSalary(SalaryAccount salaryAccount) {
        salaryAccount.setCreateDate(new Date());
        return empWithSalaryMapper.insertSelective(salaryAccount);
    }

    public Integer deleteSalaryById(Integer id) {
        return empWithSalaryMapper.deleteByPrimaryKey(id);
    }

    public Integer updateSalaryById(SalaryAccount salaryAccount) {
        return empWithSalaryMapper.updateByPrimaryKeySelective(salaryAccount);
    }
}
