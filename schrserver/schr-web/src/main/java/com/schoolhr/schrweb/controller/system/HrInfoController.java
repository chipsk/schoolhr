package com.schoolhr.schrweb.controller.system;

import com.schoolhr.model.Hr;
import com.schoolhr.model.JobLevel;
import com.schoolhr.model.RespBean;
import com.schoolhr.sevice.HrInfoService;
import com.schoolhr.sevice.JobLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/statistics/personnel/hrinfo")
public class HrInfoController {
    @Autowired
    HrInfoService hrInfoService;

    @GetMapping("/")
    public List<Hr> getAllHrInfo(){
        return hrInfoService.getAllHrInfo();
    }
    @PostMapping("/")
    public RespBean addHrInfo(@RequestBody Hr hr){
        if (hrInfoService.addHrInfo()){
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }
    @PutMapping("/")
    public RespBean updateHrInfo(@RequestBody Hr hr){
        if (hrInfoService.updateHrInfo()) {
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteHrInfoById(@PathVariable Integer id){
        if (hrInfoService.deleteHrInfoById()){
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }
    @DeleteMapping("/")
    public RespBean deleteHrInfoByIds(Integer[] ids){
        if (hrInfoService.deleteHrInfoByIds()){
            return RespBean.ok("批量删除成功");
        }
        return RespBean.error("批量删除失败");
    }
}
