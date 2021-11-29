package com.schoolhr.mapper;

import com.schoolhr.model.ActManagement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActManaMapper {

    List<ActManagement> getAllActions();

    List<ActManagement> GetActionsByid(@Param("id") Integer id);
}

