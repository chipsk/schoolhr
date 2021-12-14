package com.schoolhr.mapper;


import com.schoolhr.model.RuleRole;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface RuleRoleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(RuleRole record);

    int insertSelective(RuleRole record);

    RuleRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RuleRole record);

    int updateByPrimaryKey(RuleRole record);

    //    员工奖惩查询所有员工分页信息
    List<RuleRole> getAllInfoByPage(@Param("page") Integer page, @Param("size") Integer size,
                                    @Param("rr") RuleRole ruleRole,
                                    @Param("beginDateScope") Date[] beginDateScope, @Param("username")String username, @Param("userID")String userID);
    //    获取条件参数插入后的记录总数
    Long getTotal(@Param("rr") RuleRole ruleRole, @Param("beginDateScope")Date[] beginDateScope,@Param("username")String username, @Param("userID")String userID);

    List<RuleRole> getAllInfosByEidAndDate(@Param("eid")Integer eid, @Param("beginDateScope") Date[] beginDateScope);

    List<RuleRole> getInfosByTimes(@Param("startDate")Date startDate, @Param("endDate")Date endDate);
}