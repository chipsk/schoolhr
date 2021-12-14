package com.schoolhr.schrweb.controller.system;

import com.schoolhr.model.RespPageBean;
import com.schoolhr.sevice.LoggerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/sys/log")
public class LoggerInfoController {
    @Autowired
    LoggerInfoService loggerInfoService;
    @GetMapping("/")
    public RespPageBean getLoggerInfos(@RequestParam(defaultValue = "1") Integer page,
                                       @RequestParam(defaultValue = "10") Integer size,
                                       String requestManager, Date[] beginDateScope){
        loggerInfoService.insertLoggerInfos("/sys/log","查询操作日志记录");
        return loggerInfoService.getLoggerInfos(page,size,requestManager,beginDateScope);
    }
}