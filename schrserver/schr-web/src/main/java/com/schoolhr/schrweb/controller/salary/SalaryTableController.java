package com.schoolhr.schrweb.controller.salary;

import com.schoolhr.model.RespBean;
import com.schoolhr.model.RespPageBean;
import com.schoolhr.model.Salary;
import com.schoolhr.sevice.LoggerInfoService;
import com.schoolhr.sevice.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/salary/table")
public class SalaryTableController {
    @Autowired
    SalaryService salaryService;
    @Autowired
    LoggerInfoService loggerInfoService;

    @GetMapping("/")
    public RespPageBean getSalariesByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, Salary salary, Date[] beginDateScope) {
        loggerInfoService.insertLoggerInfos("/salary/table/","工资表管理中查询所有可修改的员工工资表信息");
        return salaryService.getSalariesByPage(page, size, salary, beginDateScope);
    }

    @PostMapping("/")
    public RespBean addSalary(@RequestBody Salary salary) {
        if (salaryService.insertSalary(salary) == 1) {
            loggerInfoService.insertLoggerInfos("/salary/table","创建员工工资表信息");
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteSalaryById(@PathVariable Integer id) {
        if (salaryService.deleteSalaryById(id) == 1) {
            loggerInfoService.insertLoggerInfos("/salary/table/","删除员工工资表信息");
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @DeleteMapping("/")
    public RespBean deleteSalariesByIds(Integer[] ids) {
        if (salaryService.deleteSalariesByIds(ids) == ids.length) {
            loggerInfoService.insertLoggerInfos("/salary/table","删除员工工资表信息");
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

    @PutMapping("/")
    public RespBean updateSalaryById(@RequestBody Salary salary) {
        if (salaryService.updateSalaryById(salary) == 1) {
            loggerInfoService.insertLoggerInfos("/salary/table","更新员工工资表信息");
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}
