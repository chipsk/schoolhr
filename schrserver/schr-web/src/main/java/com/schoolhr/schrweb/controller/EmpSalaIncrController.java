package com.schoolhr.schrweb.controller;

import com.schoolhr.model.Personnel.EmpInfo;
import com.schoolhr.model.RespBean;
import com.schoolhr.sevice.EmpSalaIncrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personnel/salary")
public class EmpSalaIncrController {
    @Autowired
    EmpSalaIncrService empSalaIncrService;
    @GetMapping("/")
    public List<EmpInfo> getAllSalary(){
        return empSalaIncrService.getAllsalary();
    }

    @PutMapping("/")
    public RespBean updateEmp(@RequestBody EmpInfo salary) {
        if (empSalaIncrService.updatesalary(salary) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}
