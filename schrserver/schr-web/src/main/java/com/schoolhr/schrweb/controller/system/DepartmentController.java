package com.schoolhr.schrweb.controller.system;


import com.schoolhr.model.Department;
import com.schoolhr.model.RespBean;
import com.schoolhr.sevice.DepartmentService;
import com.schoolhr.sevice.LoggerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    LoggerInfoService loggerInfoService;

    @GetMapping("/")
    public List<Department> getAllDepartments(){
        loggerInfoService.insertLoggerInfos("/system/basic/department/","查询所有的部门信息");
        return departmentService.getAllDepartments();
    }

    @GetMapping("/all")
    public List<Department> getAllDepartmentsWithNone(){
        loggerInfoService.insertLoggerInfos("/system/basic/department/all","查询所有的部门信息");
        return departmentService.getAllDepartmentsWithNone();
    }

    @PostMapping("/")
    public RespBean addDep(@RequestBody Department dep){
        departmentService.addDep(dep);
        if (dep.getResult()==1){
            loggerInfoService.insertLoggerInfos("/system/basic/department/","添加部门信息");
            return RespBean.ok("添加成功",dep);
        }
        return RespBean.error("添加失败");
    }
    @DeleteMapping("/{id}")
    public RespBean deleteDepById(@PathVariable Integer id){
        Department dep=new Department();
        dep.setId(id);
        departmentService.deleteDepById(dep);
        //对应下面的deleteDep返回的result
        if (dep.getResult()==-2){
            return RespBean.error("该部门下有子部门，删除失败");
        }else if (dep.getResult()==-1){
            return RespBean.error("该部门下有员工，删除失败");
        }else if (dep.getResult()==1){
            loggerInfoService.insertLoggerInfos("/system/basic/department/","删除该部门信息");
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }

}
