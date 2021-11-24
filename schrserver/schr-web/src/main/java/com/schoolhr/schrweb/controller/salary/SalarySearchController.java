package com.schoolhr.schrweb.controller.salary;

import com.schoolhr.model.Position;
import com.schoolhr.model.RespBean;
import com.schoolhr.model.Salary;
import com.schoolhr.sevice.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salary/search")
public class SalarySearchController {
    @Autowired
    SalaryService salaryService;

    @GetMapping("/")
    public List<Salary> getAllSalaries() {
        return salaryService.getAllSalaries();
    }
    @GetMapping("/{userID}")
    public List<Salary> getIDSalaries(@PathVariable Integer userID) {
        return salaryService.getIDSalaries(userID);
    }

    @GetMapping("/name/{username}")
    public List<Salary> getnameSalaries(@PathVariable String username){
        return salaryService.getnameSalaries(username);
    }


}
