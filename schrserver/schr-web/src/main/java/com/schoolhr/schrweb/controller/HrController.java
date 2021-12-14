package com.schoolhr.schrweb.controller;

import com.schoolhr.model.Hr;
import com.schoolhr.model.RespBean;
import com.schoolhr.model.Role;
import com.schoolhr.sevice.EmpHrService;
import com.schoolhr.sevice.HrService;
import com.schoolhr.sevice.LoggerInfoService;
import com.schoolhr.sevice.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/hr")
public class HrController {
    @Autowired
    HrService hrService;
    @Autowired
    LoggerInfoService loggerInfoService;
    @Autowired
    RoleService roleService;
    @Autowired
    EmpHrService empHrService;
    @GetMapping("/")
    public List<Hr> getAllHrs(String keywords){
        loggerInfoService.insertLoggerInfos("/system/manager/hr/","查询所有的用户信息");
        return hrService.getAllHrs(keywords);
    }

    @GetMapping("/add")
    public RespBean addHr(){
        if (hrService.addHr() == 1) {
            loggerInfoService.insertLoggerInfos("/system/manager/hr/","添加一个用户信息");
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }
    @PutMapping("/")
    public RespBean updateHr(@RequestBody Hr hr){
        if (hrService.updateHr(hr)==1){
            loggerInfoService.insertLoggerInfos("/system/manager/hr/","更新用户信息");
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }
    @GetMapping("/roles")
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }
    @PutMapping("/roles")
    public RespBean updateHrRole(Integer hrid, Integer[] rids) {
        if (hrService.updateHrRole(hrid, rids)) {
            loggerInfoService.insertLoggerInfos("/system/manager/hr/roles","更新所有用户对应的权限");
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteHrById(@PathVariable Integer id) {
        if (hrService.deleteHrById(id) == 1) {
            loggerInfoService.insertLoggerInfos("/system/manager/hr/"+id,"删除用户");
            return RespBean.ok("删除成功!");
        }else if(hrService.deleteHrById(id) == 2) {
            return RespBean.error("该用户为超级管理员，禁止删除！");
        }else{
            return RespBean.error("删除失败!");
        }
    }
}
