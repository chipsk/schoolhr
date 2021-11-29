package com.schoolhr.schrweb.controller;

import com.schoolhr.model.Personnel.EmpInfo;
import com.schoolhr.model.Personnel.EmpSalary;
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

    @GetMapping("/") //ok
    public List<EmpSalary> getAllSalary(){
        return empSalaIncrService.getAllsalary();
    }

    @GetMapping("/{userID}") //ok
    public List<EmpInfo> getSalaryByUserid( @PathVariable Integer userID){
        return empSalaIncrService.getSalaryByid(userID);
    }

    @PutMapping("/") //ok
    public RespBean updateSalaryByid(@RequestBody EmpInfo salary) {
        if (empSalaIncrService.updateSalaryByid(salary) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}



