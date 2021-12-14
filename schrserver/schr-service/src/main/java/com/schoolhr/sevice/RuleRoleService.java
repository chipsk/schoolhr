package com.schoolhr.sevice;

import com.schoolhr.mapper.RuleMapper;
import com.schoolhr.mapper.RuleRoleMapper;
import com.schoolhr.model.RespPageBean;
import com.schoolhr.model.RuleRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class RuleRoleService {
    @Autowired
    RuleRoleMapper ruleRoleMapper;
    @Autowired
    RuleMapper ruleMapper;
    SimpleDateFormat yearFormat=new SimpleDateFormat("yyyy");
    SimpleDateFormat monthFormat=new SimpleDateFormat("MM");
    DecimalFormat decimalFormat= new DecimalFormat("##.00");
    public RespPageBean getAllRuleRoleInfoByPage(Integer page, Integer size, RuleRole ruleRole, Date[] beginDateScope, String username, String userID) {
        if(page!=null&&size!=null){
            page=(page-1)*size;
        }
        List<RuleRole> data=ruleRoleMapper.getAllInfoByPage(page,size,ruleRole,beginDateScope,username,userID);
        Long total=ruleRoleMapper.getTotal(ruleRole,beginDateScope,username,userID);
        RespPageBean bean=new RespPageBean();
        bean.setData(data);
        bean.setTotal(total);
        return bean;
    }

    public Integer addRuleRole(RuleRole ruleRole) {
        ruleRole.setCreateDate(new Date());
        return  ruleRoleMapper.insertSelective(ruleRole);
    }

    public Integer updateRuleRole(RuleRole ruleRole) {
        return ruleRoleMapper.updateByPrimaryKey(ruleRole);
    }

    public Integer deleteRuleRole(Integer id) {
        return ruleRoleMapper.deleteByPrimaryKey(id);
    }

    //    计算阶段绩效分数
    public Integer getAllScoreByEid(RuleRole ruleRole,Date[] beginDateScope){
        List<RuleRole> list=ruleRoleMapper.getAllInfosByEidAndDate(ruleRole.getEid(),beginDateScope);
        int count =100;
        if (list == null || list.size() == 0) {
            return count;
        }
        for(int i=0;i<list.size();i++){
            count+=ruleMapper.selectByPrimaryKey(list.get(i).getRid()).getRuleValue();
        }
        if (count >= 100) {
            count=100;
        }
        if(count<=0){
            count=0;
        }
        return count;
    }
}
