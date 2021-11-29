package com.schoolhr.sevice;

import com.schoolhr.mapper.EmpInfoMapper;
import com.schoolhr.model.Personnel.AllEmpDepartment;
import com.schoolhr.model.Personnel.EmpInfo;
import com.schoolhr.model.Personnel.EmpMove;
import com.schoolhr.model.Personnel.EmpWorkstatus;
import com.schoolhr.model.RespPageBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class EmpInfoService {
    @Autowired
    EmpInfoMapper empInfoMapper;
    public final static Logger logger = LoggerFactory.getLogger(EmpInfoService.class);
    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    DecimalFormat decimalFormat = new DecimalFormat("##.00");

    public List<EmpInfo> getAllEmployee(){
        return empInfoMapper.getAllEmployee();
    }

    public List<AllEmpDepartment> getAllDepartments() {
        return empInfoMapper.getAllDepartments();
    }


    public RespPageBean getEmployeeByPage(Integer page, Integer size, EmpInfo empInfo) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<EmpInfo> data = empInfoMapper.getEmployeeByPage(page, size, empInfo);
        Long total = empInfoMapper.getTotal(empInfo);
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        bean.setTotal(total);
        return bean;
    }

    public Integer addEmp(EmpInfo empInfo) {
        return empInfoMapper.insertAll(empInfo);
    }

    public Integer deleteEmpByEid(Integer id) {
        return empInfoMapper.deleteEmpByEid(id);
    }

//    public Integer updateEmp(EmpInfo employee) {
//        return empInfoMapper.updateByPrimaryKeySelective(employee);
//    }

    public Integer addEmps(List<EmpInfo> list) {
        return empInfoMapper.addEmps(list);
    }

    public RespPageBean getEmployeeByPageWithSalary(Integer page, Integer size) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<EmpInfo> list = empInfoMapper.getEmployeeByPageWithSalary(page, size);
        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setData(list);
        respPageBean.setTotal(empInfoMapper.getTotal(null));
        return respPageBean;
    }
    public Integer maxWorkID() {
        return empInfoMapper.maxWorkID();
    }


    public Integer updateEmployeeSalaryById(Integer eid, Integer sid) {
        return empInfoMapper.updateEmployeeSalaryById(eid, sid);
    }

    public List<EmpInfo> getEmployeeById(Integer id) {
        return empInfoMapper.getEmployeeById(id);
    }

    public List<EmpInfo> getSalaryByid(Integer id) {
        return empInfoMapper.getSalaryByid(id);
    }

    public List<EmpInfo> getEmDep() {
        return empInfoMapper.getEmDep();
    }

    public Integer updateWorkStatus(EmpInfo empInfo) {
        return empInfoMapper.updateWorkStatus(empInfo);
    }

    public Integer updateJoblevel(EmpInfo empInfo) {
        return empInfoMapper.updateJoblevel(empInfo);
    }



    public List<EmpWorkstatus> getAllStatus() {
        return empInfoMapper.getAllStatus();
    }

    public int upempinfo(EmpInfo empInfo) {
        return empInfoMapper.upempinfo(empInfo);
    }
}
