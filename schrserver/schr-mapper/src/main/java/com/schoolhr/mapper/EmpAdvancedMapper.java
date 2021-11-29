package com.schoolhr.mapper;

import com.schoolhr.model.EmpAdvanced;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpAdvancedMapper {
    List<EmpAdvanced> getAllEmpAdvanced();

    List<EmpAdvanced> getEmpAdvancedByid(@Param("id")Integer id);
}




