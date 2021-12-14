package com.schoolhr.schrweb.per;

import com.schoolhr.mapper.EmpInfoMapper;
import com.schoolhr.model.Personnel.AllEmpDepartment;
import com.schoolhr.model.Personnel.EmpInfo;
import com.schoolhr.model.Personnel.EmpMove;
import com.schoolhr.model.RespBean;
import com.schoolhr.sevice.EmpInfoService;
import com.schoolhr.sevice.EmpMoveService;
import com.schoolhr.sevice.LoggerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personnel/remove")
public class EmpMoveController {
    @Autowired
    EmpInfoService empInfoService;
    @Autowired
    EmpMoveService empMoveService;
    @Autowired
    LoggerInfoService loggerInfoService;

    @GetMapping("/") //ok
    public List<EmpMove> getAllEmpStatus(){
        loggerInfoService.insertLoggerInfos("/personnel/remove/","查询员工岗位信息");
        return empMoveService.getEmpStatus();
    }

    @GetMapping("/{userID}") //ok
    public List<EmpMove> getEmpStatusByid(@PathVariable Integer userID){
        return empMoveService.getEmpStatusByid(userID);
    }

    @PutMapping("/updepartment") //ok
    public RespBean upDepartment(@RequestBody EmpMove empMove){
        if (empMoveService.upDepartment(empMove) == 1) {
            loggerInfoService.insertLoggerInfos("/personnel/updepartment","更新员工部门信息");
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @PutMapping("/upworkstat") //ok
    public RespBean updateWorkStatus(@RequestBody EmpMove empMove){
        if (empMoveService.upworkstat(empMove) == 1) {
            loggerInfoService.insertLoggerInfos("/personnel/upworkstat","更新员工工作状态信息");
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @PutMapping("/upjoblevel") //ok
    public RespBean updateJoblevel(@RequestBody EmpMove empMove){
        if (empMoveService.upjoblevel(empMove) == 1) {
            loggerInfoService.insertLoggerInfos("/personnel/upjoblevel","更新员工职称信息");
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
    @PutMapping("/upposition") //ok
    public RespBean upposition(@RequestBody EmpMove empMove){
        if (empMoveService.upposition(empMove) == 1) {
            loggerInfoService.insertLoggerInfos("/personnel/upposition","更新员工职位信息");
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

}
