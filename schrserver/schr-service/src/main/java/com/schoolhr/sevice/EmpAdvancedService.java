package com.schoolhr.sevice;

import com.schoolhr.mapper.ActManaMapper;
import com.schoolhr.mapper.EmpAdvancedMapper;
import com.schoolhr.model.EmpAdvanced;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpAdvancedService {
    @Autowired
    EmpAdvancedMapper empAdvancedMapper;


    public List<EmpAdvanced> getAllEmpAdvanced() {
        return empAdvancedMapper.getAllEmpAdvanced();
    }

    public List<EmpAdvanced> getEmpAdvancedByid(Integer id) {
        return empAdvancedMapper.getEmpAdvancedByid(id);
    }
}
