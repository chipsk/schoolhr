package com.schoolhr.sevice;

import com.schoolhr.mapper.EmpInfoMapper;
import com.schoolhr.model.Personnel.AllEmpDepartment;
import com.schoolhr.model.Personnel.EmpInfo;
import com.schoolhr.model.Personnel.EmpMove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpMoveService {
    @Autowired
    EmpInfoMapper empInfoMapper;

    public List<EmpMove> getEmpStatus() {
        return empInfoMapper.getEmpStatus();
    }

    public int upDepartment(EmpMove empMove) {
        return empInfoMapper.upDepartment(empMove);
    }

    public int upworkstat(EmpMove empMove) {
        return empInfoMapper.upworkstat(empMove);
    }

    public int upjoblevel(EmpMove empMove) {
        return empInfoMapper.upjoblevel(empMove);
    }

    public int upposition(EmpMove empMove) {
        return empInfoMapper.upposition(empMove);
    }

    public List<EmpMove> getEmpStatusByid(Integer userID) {
        return empInfoMapper.getEmpStatusByid(userID);
    }
}
