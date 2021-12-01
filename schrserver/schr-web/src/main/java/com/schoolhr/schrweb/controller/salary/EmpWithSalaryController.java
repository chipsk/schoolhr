package com.schoolhr.schrweb.controller.salary;

import com.schoolhr.model.*;
import com.schoolhr.sevice.EmpWithSalaryService;
import com.schoolhr.sevice.SalaryAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/salary/sobcfg1")
public class EmpWithSalaryController {
    @Autowired
    EmpWithSalaryService empWithSalaryService;

    @GetMapping("/")
    public RespPageBean getAllSalaryAccounts(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size,Employee employee, Date[] beginDateScope) {
        return empWithSalaryService.getAllSalaryAccounts(page, size,employee, beginDateScope);
    }

    @PostMapping("/")
    public RespBean addSalary(@RequestBody Employee employee) {
        if (empWithSalaryService.addSalary(employee) == 1) {
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteSalaryById(@PathVariable Integer id) {
        if (empWithSalaryService.deleteSalaryById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    public RespBean updateSalaryById(@RequestBody Employee employee) {
        if (empWithSalaryService.updateSalaryById(employee) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}
