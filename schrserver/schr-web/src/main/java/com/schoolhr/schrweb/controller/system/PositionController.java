package com.schoolhr.schrweb.controller.system;

import com.schoolhr.model.Position;
import com.schoolhr.model.RespBean;
import com.schoolhr.sevice.LoggerInfoService;
import com.schoolhr.sevice.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/pos")
public class PositionController {
    @Autowired
    PositionService positionService;
    @Autowired
    LoggerInfoService loggerInfoService;

    @GetMapping("/")
    public List<Position> getAllPositions(){
        loggerInfoService.insertLoggerInfos("/system/basic/pos/","查询所有的职位信息");
        return positionService.getAllPositions();
    }
    @PostMapping("/")
    //@RequestBody用来接收前端的JSON
    public RespBean addPosition(@RequestBody Position position){
        if (positionService.addPosition(position)==1){
            loggerInfoService.insertLoggerInfos("/system/basic/pos/","添加所有的职位信息");
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }
    @PutMapping("/")
    public RespBean updatePosition(@RequestBody Position position){
        if (positionService.updatePosition(position)==1){
            loggerInfoService.insertLoggerInfos("/system/basic/pos/","更新所有的职位信息");
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }

    @DeleteMapping("/{id}")
    public RespBean deletePositionById(@PathVariable Integer id){
        if (positionService.deletePositionById(id)==1){
            loggerInfoService.insertLoggerInfos("/system/basic/pos/","删除所有的职位信息");
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }
    @DeleteMapping("/")
    public RespBean deletePositionByIds(Integer[] ids){
        if (positionService.deletePositionByIds(ids)==ids.length){
            loggerInfoService.insertLoggerInfos("/system/basic/pos/","批量删除所有的职位信息");
            return RespBean.ok("批量删除成功");
        }
        return RespBean.error("批量删除失败");
    }
}
