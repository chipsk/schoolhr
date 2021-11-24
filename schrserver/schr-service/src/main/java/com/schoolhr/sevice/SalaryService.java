package com.schoolhr.sevice;

import com.schoolhr.mapper.SalaryMapper;
import com.schoolhr.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {

        @Autowired
        SalaryMapper salaryMapper;

        public List<Salary> getAllSalaries() {
            return salaryMapper.getAllSalaries();
        }

        public List<Salary> getnameSalaries(String username){
            return salaryMapper.getnameSalaries(username);
        }
        public List<Salary> getIDSalaries(Integer userID){
            return salaryMapper.getIDSalaries(userID);
        }
        public Integer addSalary(Salary salary) {
            salary.setAdate(new Date());
            return salaryMapper.insertSelective(salary);
        }

        public Integer deleteSalaryById(Integer uid) {
            return salaryMapper.deleteByPrimaryKey(uid);
        }

        public Integer updateSalaryById(Salary salary) {
            return salaryMapper.updateByPrimaryKeySelective(salary);
        }



}
