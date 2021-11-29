package com.schoolhr.sevice;

import com.schoolhr.mapper.SalaryMapper;
import com.schoolhr.model.RespPageBean;
import com.schoolhr.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SalaryService {

        @Autowired
        SalaryMapper salaryMapper;

        public RespPageBean getSalariesByPage(Integer page, Integer size, Salary salary, Date[] beginDateScope) {
            if (page != null && size != null) {
                page = (page - 1) * size;
            }
            List<Salary> data = salaryMapper.getSalariesByPage(page, size, salary, beginDateScope);
            RespPageBean bean = new RespPageBean();
            bean.setData(data);
            return bean;
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

        public Integer insertSalary(Salary salary) {
            salary.setAdate(new Date());
            return salaryMapper.insert(salary);
        }

        public Integer deleteSalaryById(Integer id) {
            return salaryMapper.deleteByPrimaryKey(id);
        }

        public Integer deleteSalariesByIds(Integer[] ids) {
            return salaryMapper.deleteSalariesByIds(ids);
        }

        public Integer updateSalaryById(Salary salary) {
            return salaryMapper.updateByPrimaryKeySelective(salary);
        }



}
