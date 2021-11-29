package com.schoolhr.mapper;

import com.schoolhr.model.Salary;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SalaryMapper {

    int deleteByPrimaryKey(Integer id);

    Integer deleteSalariesByIds(@Param("ids") Integer[] ids);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);

    List<Salary> getAllSalaries();
    List<Salary> getIDSalaries(@Param("userID") Integer userID);
    List<Salary> getnameSalaries(@Param("username") String username);
    List<Salary> getdepartSalaries(@Param("departmentID") Integer departmentid,@Param("name") String name);

    List<Salary> getSalariesByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("sal") Salary salary, @Param("beginDateScope") Date[] beginDateScope);

}
