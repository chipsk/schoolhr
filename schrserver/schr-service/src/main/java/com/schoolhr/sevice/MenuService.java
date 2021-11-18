package com.schoolhr.sevice;

import com.schoolhr.mapper.MenuMapper;
import com.schoolhr.mapper.MenuRoleMapper;
import com.schoolhr.model.Hr;
import com.schoolhr.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;

    @Autowired
    MenuRoleMapper menuRoleMapper;

    public List<Menu> getMenusByHrId() {
//        System.out.println(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }


}
