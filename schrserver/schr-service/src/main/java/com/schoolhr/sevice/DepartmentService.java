package com.schoolhr.sevice;

import com.schoolhr.mapper.DepartmentMapper;
import com.schoolhr.mapper.EmpInfoMapper;
import com.schoolhr.model.Department;
import com.schoolhr.model.Personnel.EmpInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmpInfoMapper empInfoMapper;
//    public List<EmpInfo> getAllDepartments() {
//        return empInfoMapper.getAllDepartments();
//    }

//    public void addDep(Department dep) {
//        dep.setEnabled(true);
//        departmentMapper.addDep(dep);
//    }

    public void deleteDepById(Department dep) {
        departmentMapper.deleteDepById(dep);
    }

    public List<Department> getAllDepartmentsWithOutChildren() {
        return departmentMapper.getAllDepartmentsWithOutChildren();
    }
}
