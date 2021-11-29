package com.schoolhr.sevice;

import com.schoolhr.mapper.SalaryAccountMapper;
import com.schoolhr.model.SalaryAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SalaryAccountService {
    @Autowired
    SalaryAccountMapper salaryAccountMapper;

    public List<SalaryAccount> getAllSalaryAccounts() {
        return salaryAccountMapper.getAllSalaryAccounts();
    }

    public Integer addSalary(SalaryAccount salaryAccount) {
        salaryAccount.setCreateDate(new Date());
        return salaryAccountMapper.insertSelective(salaryAccount);
    }

    public Integer deleteSalaryById(Integer id) {
        return salaryAccountMapper.deleteByPrimaryKey(id);
    }

    public Integer updateSalaryById(SalaryAccount salaryAccount) {
        return salaryAccountMapper.updateByPrimaryKeySelective(salaryAccount);
    }
}
