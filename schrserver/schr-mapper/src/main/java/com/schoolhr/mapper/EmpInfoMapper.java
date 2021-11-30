package com.schoolhr.mapper;

import com.schoolhr.model.EmpWithSalary;
import com.schoolhr.model.Personnel.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpInfoMapper {
    List<EmpInfo> getSalaryByid(@Param("userID") Integer userID);

    List<EmpInfo> getAllEmployee() ;


    int deleteEmpByEid(@Param("id")Integer id);


    int insertAll(EmpInfo record);

    int insertSelective(EmpInfo record);

    EmpInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmpInfo record);

    int updateByPrimaryKey(EmpInfo record);
    Integer maxWorkID();

    List<EmpInfo> getEmployeeByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("emp") EmpInfo employee);

    Long getTotal(@Param("emp") EmpInfo employee);


    Integer addEmps(@Param("list") List<EmpInfo> list);

    List<EmpInfo> getEmployeeById(Integer id);

    List<EmpInfo> getEmployeeByPageWithSalary(@Param("page") Integer page, @Param("size") Integer size);

    Integer updateEmployeeSalaryById(@Param("eid") Integer eid, @Param("sid") Integer sid);

    List<AllEmpDepartment> getAllDepartments();

    List<EmpWithSalary> getAllsalary();

    int updatesalaryByid(EmpInfo record);

    List<EmpInfo> getEmDep();

    int updateWorkStatus(EmpInfo record);

    int updateJoblevel(EmpInfo record);

    int upDepartment(EmpMove record);

    List<EmpWorkstatus> getAllStatus();

    List<EmpMove> getEmpStatus();

    int upworkstat(EmpMove record);

    int upjoblevel(EmpMove record);

    int upposition(EmpMove record);

    List<EmpMove> getEmpStatusByid(Integer userID);

    int upempinfo(EmpInfo empInfo);
}

