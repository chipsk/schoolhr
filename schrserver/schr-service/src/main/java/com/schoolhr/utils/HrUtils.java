package com.schoolhr.utils;

import com.schoolhr.model.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

public class HrUtils {
    //    获取当前已登录用户的角色等信息
    public static Hr getCurrentHr(){
        return ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
