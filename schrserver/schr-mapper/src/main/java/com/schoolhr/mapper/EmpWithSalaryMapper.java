package com.schoolhr.mapper;

import com.schoolhr.model.Salary;
import com.schoolhr.model.SalaryAccount;
import com.schoolhr.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface EmpWithSalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
//    Long getTotal(@Param("emp") Employee employee,@Param("beginDateScope") Date[] beginDateScope);
//
    List<Employee> getAllSalaryAccounts(@Param("page") Integer page, @Param("size") Integer size, @Param("emps") Employee employee, @Param("beginDateScope") Date[] beginDateScope);
}
