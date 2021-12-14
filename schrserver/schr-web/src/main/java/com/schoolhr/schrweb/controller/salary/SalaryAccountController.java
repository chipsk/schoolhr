package com.schoolhr.schrweb.controller.salary;

import com.schoolhr.model.RespBean;
import com.schoolhr.model.SalaryAccount;
import com.schoolhr.sevice.LoggerInfoService;
import com.schoolhr.sevice.SalaryAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salary/sob")
public class SalaryAccountController {
    @Autowired
    SalaryAccountService salaryAccountService;
    @Autowired
    LoggerInfoService loggerInfoService;

    @GetMapping("/")
    public List<SalaryAccount> getAllSalaryAccounts() {
        loggerInfoService.insertLoggerInfos("/salary/sob/","查询工资账套信息");
        return salaryAccountService.getAllSalaryAccounts();
    }

    @PostMapping("/")
    public RespBean addSalary(@RequestBody SalaryAccount salaryAccount) {
        if (salaryAccountService.addSalary(salaryAccount) == 1) {
            loggerInfoService.insertLoggerInfos("/salary/sob/","添加工资账套信息");
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteSalaryById(@PathVariable Integer id) {
        if (salaryAccountService.deleteSalaryById(id) == 1) {
            loggerInfoService.insertLoggerInfos("/salary/sob/","删除工资账套信息");
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    public RespBean updateSalaryById(@RequestBody SalaryAccount salaryAccount) {
        if (salaryAccountService.updateSalaryById(salaryAccount) == 1) {
            loggerInfoService.insertLoggerInfos("/salary/sob/","更新工资账套信息");
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}
