package com.schoolhr.schrweb.controller.salary;

import com.schoolhr.model.Position;
import com.schoolhr.model.RespBean;
import com.schoolhr.model.Salary;
import com.schoolhr.sevice.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salary")
public class SalaryController {
    @Autowired
    SalaryService salaryService;

    @GetMapping("/search")
    public List<Salary> getAllSalaries() {
        return salaryService.getAllSalaries();
    }
    @GetMapping("/search/{userID}")
    public List<Salary> getIDSalaries(@PathVariable Integer userID) {
        return salaryService.getIDSalaries(userID);
    }

    @GetMapping("/search/name/{username}")
    public List<Salary> getnameSalaries(@PathVariable String username){
        return salaryService.getnameSalaries(username);
    }

//    @PostMapping("/")
//    public RespBean insertSalary(@RequestBody Salary salary) {
//        if (salaryService.insertSalary(salary) == 1) {
//            return RespBean.ok("添加成功!");
//        }
//        return RespBean.error("添加失败!");
//    }

    @PostMapping("/")
    public RespBean addSalary(@RequestBody Salary salary) {
        if (salaryService.addSalary(salary) == 1) {
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @DeleteMapping("/{uid}")
    public RespBean deleteSalaryById(@PathVariable Integer uid) {
        if (salaryService.deleteSalaryById(uid) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/update/")
    public RespBean updateSalaryById(@RequestBody Salary salary) {
        if (salaryService.updateSalaryById(salary) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}
