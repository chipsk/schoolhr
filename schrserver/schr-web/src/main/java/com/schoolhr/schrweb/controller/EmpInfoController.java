package com.schoolhr.schrweb.controller;

import com.schoolhr.model.Personnel.AllEmpDepartment;
import com.schoolhr.model.Personnel.EmpInfo;
import com.schoolhr.model.Personnel.EmpMove;
import com.schoolhr.model.Personnel.EmpWorkstatus;
import com.schoolhr.model.RespBean;
import com.schoolhr.sevice.EmpInfoService;
import com.schoolhr.sevice.PositionService;
//import com.schoolhr.utils.POIUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personnel/emp")
public class EmpInfoController {
    @Autowired
    EmpInfoService empInfoService;

    @Autowired
    PositionService positionService;

    @GetMapping("/")  //ok
    public List<EmpInfo> getAllEmployee(){
        return empInfoService.getAllEmployee();
    }

    @GetMapping("/{id}")  //ok
    public List<EmpInfo> getEmployeeById(@PathVariable Integer id){
        return empInfoService.getEmployeeById(id);
    }

    @PostMapping("/")  //ok
    public RespBean addEmp(@RequestBody EmpInfo employee) {
        if (empInfoService.addEmp(employee) == 1) {
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @DeleteMapping("/{id}") //ok
    public RespBean deleteEmpByEid(@PathVariable Integer id) {
        if (empInfoService.deleteEmpByEid(id) == 1) {
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }
    @PutMapping("/empinfo")  //ok
    public RespBean upEmpInfo(@RequestBody EmpInfo empInfo){
        if (empInfoService.upempinfo(empInfo) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

//    @GetMapping("/deps")  //ok
//    public List<AllEmpDepartment> getAllDepartments() {
//        return empInfoService.getAllDepartments();
//    }

    @GetMapping("/status")  //ok
    public List<EmpWorkstatus> getAllStatus() {
        return empInfoService.getAllStatus();
    }

//    @PutMapping("/")
//    public RespBean updateEmp(@RequestBody EmpInfo employee) {
//        if (empInfoService.updateEmp(employee) == 1) {
//            return RespBean.ok("更新成功!");
//        }
//        return RespBean.error("更新失败!");
//    }

//    @GetMapping("/export")
//    public ResponseEntity<byte[]> exportData() {
//        List<EmpInfo> list = (List<EmpInfo>) empInfoService.getEmployeeByPage(null, null, new EmpInfo()).getData();
//        return POIUtils.employee2Excel(list);
//    }
//
//    @PostMapping("/import")
//    public RespBean importData(MultipartFile file) throws IOException {
//        List<EmpInfo> list = POIUtils.excel2Employee(file, departmentService.getAllDepartmentsWithOutChildren(), positionService.getAllPositions());
//        if (empInfoService.addEmps(list) == list.size()) {
//            return RespBean.ok("上传成功");
//        }
//        return RespBean.error("上传失败");
//    }
}
