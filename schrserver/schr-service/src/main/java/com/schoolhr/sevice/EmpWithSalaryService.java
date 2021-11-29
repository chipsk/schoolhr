package com.schoolhr.sevice;

import com.schoolhr.mapper.EmpWithSalaryMapper;
import com.schoolhr.model.Employee;
import com.schoolhr.model.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmpWithSalaryService {
    @Autowired
    EmpWithSalaryMapper empWithSalaryMapper;

    public RespPageBean getAllSalaryAccounts(Integer page, Integer size, Employee employee, Date[] beginDateScope) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<Employee> data = empWithSalaryMapper.getAllSalaryAccounts(page,size,employee,beginDateScope);
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        return  bean;
    }

    public Integer addSalary(Employee employee) {
        return empWithSalaryMapper.insertSelective(employee);
    }

    public Integer deleteSalaryById(Integer id) {
        return empWithSalaryMapper.deleteByPrimaryKey(id);
    }

    public Integer updateSalaryById(Employee employee) {
        return empWithSalaryMapper.updateByPrimaryKeySelective(employee);
    }
}
