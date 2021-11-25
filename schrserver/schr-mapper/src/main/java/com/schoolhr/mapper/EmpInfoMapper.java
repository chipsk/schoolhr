package com.schoolhr.mapper;

import com.schoolhr.model.Personnel.EmpInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface EmpInfoMapper {
    List<EmpInfo> getSalaryByid(Integer id);

    List<EmpInfo> getAllEmployee() ;


    int deleteEmpByEid(Integer id);


    int insert(EmpInfo record);

    int insertSelective(EmpInfo record);

    EmpInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmpInfo record);

    int updateByPrimaryKey(EmpInfo record);
    Integer maxWorkID();

    List<EmpInfo> getEmployeeByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("emp") EmpInfo employee);

    Long getTotal(@Param("emp") EmpInfo employee);


    Integer addEmps(@Param("list") List<EmpInfo> list);

    EmpInfo getEmployeeById(Integer id);

    List<EmpInfo> getEmployeeByPageWithSalary(@Param("page") Integer page, @Param("size") Integer size);

    Integer updateEmployeeSalaryById(@Param("eid") Integer eid, @Param("sid") Integer sid);

    List<EmpInfo> getAllDepartments();

    List<EmpInfo> getAllsalary();

    int updatesalary(EmpInfo record);

    List<EmpInfo> getEmDep();

    int updateWorkStatus(EmpInfo record);

    int updateJoblevel(EmpInfo record);
}

