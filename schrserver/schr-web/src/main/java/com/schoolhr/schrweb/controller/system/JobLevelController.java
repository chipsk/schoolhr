package com.schoolhr.schrweb.controller.system;

import com.schoolhr.model.JobLevel;
import com.schoolhr.model.RespBean;
import com.schoolhr.sevice.JobLevelService;
import com.schoolhr.sevice.LoggerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/joblevel")
public class JobLevelController {
    @Autowired
    JobLevelService jobLevelService;
    @Autowired
    LoggerInfoService loggerInfoService;
    @GetMapping("/")
    public List<JobLevel> getAllJobLevels(){
        loggerInfoService.insertLoggerInfos("/system/basic/joblevel/","查询所有的职称信息");
        return jobLevelService.getAllJobLevels();
    }
    @PostMapping("/")
    public RespBean addPosition(@RequestBody JobLevel jobLevel){
        if (jobLevelService.addJobLevel(jobLevel)==1){
            loggerInfoService.insertLoggerInfos("/system/basic/joblevel/","添加所有的职称信息");
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }
    @PutMapping("/{id}")
    public RespBean updatePosition(@PathVariable Integer id){
        if (jobLevelService.updateJobLevel(id)==1){
            loggerInfoService.insertLoggerInfos("/system/basic/joblevel/","更新所有的职称信息");
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }

    @DeleteMapping("/{id}")
    public RespBean deletePositionById(@PathVariable Integer id){
        if (jobLevelService.deleteJobLevelById(id)==1){
            loggerInfoService.insertLoggerInfos("/system/basic/joblevel/","删除所有的职称信息");
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }
    @DeleteMapping("/")
    public RespBean deleteJobLevelByIds(Integer[] ids){
        if (jobLevelService.deleteJobLevelsByIds(ids)==ids.length){
            loggerInfoService.insertLoggerInfos("/system/basic/joblevel/","批量删除所有的职称信息");
            return RespBean.ok("批量删除成功");
        }
        return RespBean.error("批量删除失败");
    }
}
