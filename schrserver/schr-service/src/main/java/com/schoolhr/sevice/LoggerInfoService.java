package com.schoolhr.sevice;

import com.schoolhr.mapper.LoggerInfosMapper;
import com.schoolhr.model.LoggerInfos;
import com.schoolhr.model.RespPageBean;
import com.schoolhr.utils.HrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LoggerInfoService {
    @Autowired
    LoggerInfosMapper loggerInfosMapper;
    public RespPageBean getLoggerInfos(Integer page, Integer size, String requestManager, Date[] beginDateScope) {
        if(page!=null&&size!=null){
            page=(page-1)*size;
        }
        List<LoggerInfos> data=loggerInfosMapper.getLoggerInfos(page,size,requestManager,beginDateScope);
        for(int i=0;i<data.size();i++) {
        }
        Long total=loggerInfosMapper.getTotal(requestManager,beginDateScope);
        RespPageBean bean=new RespPageBean();
        bean.setData(data);
        bean.setTotal(total);
        return bean;
    }
    //  接口操作请求录入阶段
    public void insertLoggerInfos(String url,String Info){
        LoggerInfos loggerInfos=new LoggerInfos();
        loggerInfos.setRequestInfos(Info);
        loggerInfos.setRequestURL(url);
        loggerInfos.setRequestTime(new Date());
        loggerInfos.setRequestManagerId(HrUtils.getCurrentHr().getId());
        loggerInfosMapper.insertSelective(loggerInfos);
    }
}
