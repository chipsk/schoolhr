//package com.schoolhr.schrweb.controller.salary;
//
//import com.schoolhr.model.RespBean;
//import com.schoolhr.model.SalaryAccount;
//import com.schoolhr.sevice.EmpWithSalaryService;
//import com.schoolhr.sevice.SalaryAccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/salary/sobcfg")
//public class EmpWithSalaryController {
//    @Autowired
//    EmpWithSalaryService empWithSalaryService;
//
//    @GetMapping("/")
//    public List<SalaryAccount> getAllSalaryAccounts() {
//        return empWithSalaryService.getAllSalaryAccounts();
//    }
//
//    @PostMapping("/")
//    public RespBean addSalary(@RequestBody SalaryAccount salaryAccount) {
//        if (empWithSalaryService.addSalary(salaryAccount) == 1) {
//            return RespBean.ok("添加成功!");
//        }
//        return RespBean.error("添加失败!");
//    }
//
//    @DeleteMapping("/{id}")
//    public RespBean deleteSalaryById(@PathVariable Integer id) {
//        if (empWithSalaryService.deleteSalaryById(id) == 1) {
//            return RespBean.ok("删除成功！");
//        }
//        return RespBean.error("删除失败！");
//    }
//
//    @PutMapping("/")
//    public RespBean updateSalaryById(@RequestBody SalaryAccount salaryAccount) {
//        if (empWithSalaryService.updateSalaryById(salaryAccount) == 1) {
//            return RespBean.ok("更新成功!");
//        }
//        return RespBean.error("更新失败!");
//    }
//}
