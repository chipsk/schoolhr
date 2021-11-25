package com.schoolhr.schrweb.controller;

import com.schoolhr.model.Personnel.EmpInfo;
import com.schoolhr.sevice.EmpInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personnel/remove")
public class EmpMoveController {
    @Autowired
    EmpInfoService empInfoService;
    @GetMapping("/")
    public List<EmpInfo> getEmpDep(){
        return empInfoService.getEmDep();
    }

    @PostMapping("/upworkstat")
    public Integer updateWorkStatus(EmpInfo empInfo){
        return empInfoService.updateWorkStatus(empInfo);

    }
    @PostMapping("/upjoblevel")
    public Integer updateJoblevel(EmpInfo empInfo){
        return empInfoService.updateJoblevel(empInfo);

    }

}
