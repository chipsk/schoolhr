package com.schoolhr.schrweb.controller.system;

import com.schoolhr.model.Menu;
import com.schoolhr.model.RespBean;
import com.schoolhr.model.Role;
import com.schoolhr.sevice.LoggerInfoService;
import com.schoolhr.sevice.MenuService;
import com.schoolhr.sevice.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/permiss")
public class PermissController {
    @Autowired
    RoleService roleService;
    @Autowired
    MenuService menuService;
    @Autowired
    LoggerInfoService loggerInfoService;

    @GetMapping("/")
    public List<Role> getAllRoles(){
        loggerInfoService.insertLoggerInfos("/system/basic/permiss/","查询所有的权限信息");
        return roleService.getAllRoles();

    }
    @GetMapping("/menus")
    public List<Menu> getAllMenus(){
        loggerInfoService.insertLoggerInfos("/system/basic/permiss/menus","查询权限组菜单角色可访问的所有菜单资源请求");
        return menuService.getAllMenus();
    }
    @GetMapping("/mids/{rid}")
    public List<Integer> getMidsByRid(@PathVariable Integer rid){
        loggerInfoService.insertLoggerInfos("/system/basic/permiss/mids/"+rid,
                "获取角色所绑定的默认的权限所对应的在权限组的菜单选项中的值");
        return  menuService.getMidsByRid(rid);
    }

    @PutMapping("/")
    public RespBean updateMenuRole(Integer rid,Integer [] mids){
        if (menuService.updateMenuRole(rid,mids)){
            loggerInfoService.insertLoggerInfos("/system/basic/permiss/","更新权限信息");
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }
    @PostMapping("/role")
    public RespBean addRole(@RequestBody Role role){
        if (roleService.addRole(role)==1){
            loggerInfoService.insertLoggerInfos("/system/basic/permiss/","添加权限信息");
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }

    @DeleteMapping("/role/{rid}")
    public RespBean deleteRoleById(@PathVariable Integer rid){
        if (roleService.deleteRoleById(rid)==1){
            loggerInfoService.insertLoggerInfos("/system/basic/permiss/","删除权限信息");
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }


}
