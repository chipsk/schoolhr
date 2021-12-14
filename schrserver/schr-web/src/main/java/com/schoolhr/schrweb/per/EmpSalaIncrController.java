package com.schoolhr.schrweb.per;

import com.schoolhr.model.Personnel.EmpInfo;
import com.schoolhr.model.EmpWithSalary;
import com.schoolhr.model.RespBean;
import com.schoolhr.sevice.EmpSalaIncrService;
import com.schoolhr.sevice.LoggerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personnel/salary")
public class EmpSalaIncrController {
    @Autowired
    EmpSalaIncrService empSalaIncrService;
    @Autowired
    LoggerInfoService loggerInfoService;

    @GetMapping("/") //ok
    public List<EmpWithSalary> getAllSalary(){
        loggerInfoService.insertLoggerInfos("/personnel/salary/","查询员工薪资调整记录");
        return empSalaIncrService.getAllsalary();
    }

    @GetMapping("/{userID}") //ok
    public List<EmpInfo> getSalaryByUserid( @PathVariable Integer userID){
        return empSalaIncrService.getSalaryByid(userID);
    }

    @PutMapping("/") //ok
    public RespBean updateSalaryByid(@RequestBody EmpInfo salary) {
        if (empSalaIncrService.updateSalaryByid(salary) == 1) {
            loggerInfoService.insertLoggerInfos("/personnel/salary/","修改员工薪资调整记录");
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}



