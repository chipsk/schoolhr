package com.schoolhr.mapper;

import com.schoolhr.model.Department;

import java.util.List;

public interface DepartmentMapper {

    List<Department> getAllDepartmentsByParentId(Integer pid);

    void addDep(Department dep);

    void deleteDepById(Department dep);

    List<Department> getAllDepartmentsWithOutChildren();

    List<Department> getAllDepartmentsWithNone();
}
