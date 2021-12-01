package com.schoolhr.sevice;

import com.schoolhr.mapper.EmpInfoMapper;
import com.schoolhr.model.Personnel.EmpInfo;
import com.schoolhr.model.EmpWithSalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpSalaIncrService {
    @Autowired
    EmpInfoMapper empInfoMapper;

    public List<EmpWithSalary> getAllsalary() {
        return empInfoMapper.getAllsalary();
    }

    public Integer updateSalaryByid(EmpInfo empInfo){
        return empInfoMapper.updateByPrimaryKeySelective(empInfo);

    }
    public List<EmpInfo> getSalaryByid(Integer userID){
        return empInfoMapper.getSalaryByid(userID);
    }

//    public int updateSalaryByid(EmpInfo empInfo) {
//        return empInfoMapper.updatesalaryByid(empInfo);
//    }
}
