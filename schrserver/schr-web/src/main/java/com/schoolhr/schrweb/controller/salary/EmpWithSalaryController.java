package com.schoolhr.schrweb.controller.salary;

import com.schoolhr.model.*;
import com.schoolhr.sevice.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/salary/sobcfg1")
public class EmpWithSalaryController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    SalaryService salaryService;
    @Autowired
    LoggerInfoService loggerInfoService;
    @Autowired
    EmpWithSalaryService empWithSalaryService;

    @GetMapping("/")
    public RespPageBean getAllSalaryAccounts(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size,Employee employee, Date[] beginDateScope) {
        loggerInfoService.insertLoggerInfos("/salary/sobcfg1/","查询员工工资账套信息");
        return empWithSalaryService.getAllSalaryAccounts(page, size,employee, beginDateScope);
    }

    @GetMapping("/salaries")
    public List<Salary> getAllSalaries() {
        loggerInfoService.insertLoggerInfos("/salary/sobcfg1/salaries","查询所有工资账套信息");
        return empWithSalaryService.getAllSalaries();
    }

    @PostMapping("/")
    public RespBean addSalary(@RequestBody Employee employee) {
        if (empWithSalaryService.addSalary(employee) == 1) {
            loggerInfoService.insertLoggerInfos("/salary/sobcfg1/","添加员工工资账套信息");
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteSalaryById(@PathVariable Integer id) {
        if (empWithSalaryService.deleteSalaryById(id) == 1) {
            loggerInfoService.insertLoggerInfos("/salary/sobcfg1/","删除员工工资账套信息");
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    public RespBean updateSalaryById(/*@RequestBody Employee employee*/Integer eid, Integer sid) {
//        if (empWithSalaryService.updateSalaryById(employee) == 1) {
//            return RespBean.ok("更新成功!");
//        }
        Integer result = employeeService.updateEmployeeSalaryById(eid, sid);
//      employeeService.updateEmployeeSalaryById(eid, sid)对于已经存在的更新操作，会先删除后重新插入
//      此种更新操作会返回2，而对于尚未设置工资账套的员工会直接插入，并返回1
        if (result == 1 || result == 2) {
            loggerInfoService.insertLoggerInfos("/salary/sobcfg1/","更新员工工资账套信息");
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败!");
    }
}
