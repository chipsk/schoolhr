package com.schoolhr.sevice;

import com.schoolhr.mapper.EmpInfoMapper;
import com.schoolhr.model.Personnel.EmpInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpSalaIncrService {
    @Autowired
    EmpInfoMapper empInfoMapper;

    public List<EmpInfo> getAllsalary() {
        return empInfoMapper.getAllsalary();
    }

    public Integer updatesalary(EmpInfo empInfo){
        return empInfoMapper.updatesalary(empInfo);

    }
}
