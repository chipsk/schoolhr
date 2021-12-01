package com.schoolhr.schrweb.controller;

import com.schoolhr.model.Hr;
import com.schoolhr.model.RespBean;
import com.schoolhr.model.Role;
import com.schoolhr.sevice.HrService;
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
    RoleService roleService;
    @GetMapping("/")
    public List<Hr> getAllHrs(String keywords){
        return hrService.getAllHrs(keywords);
    }

    @PutMapping("/")
    public RespBean updateHr(@RequestBody Hr hr){
        if (hrService.updateHr(hr)==1){
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }
    @GetMapping("/roles")
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }
    @PutMapping("/roles")
    public RespBean updateHrRole(Integer hrid,Integer[] rids){
        if (hrService.updateHrRole(hrid,rids)){
            return RespBean.ok("更新角色成功");
        }
        return RespBean.error("更新角色失败");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteHrById(@PathVariable Integer id){
        if (hrService.deleteHrById(id)==1){
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }
}
