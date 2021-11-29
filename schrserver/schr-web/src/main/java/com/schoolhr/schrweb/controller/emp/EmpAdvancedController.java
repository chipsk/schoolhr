package com.schoolhr.schrweb.controller.emp;

import com.schoolhr.model.EmpAdvanced;
import com.schoolhr.sevice.EmpAdvancedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee/advanced")
public class EmpAdvancedController {

    @Autowired
    EmpAdvancedService empAdvancedService;
    @GetMapping("/")
    public List<EmpAdvanced> getAllEmpAdvanced(){
        return empAdvancedService.getAllEmpAdvanced();
    }
    @GetMapping("/{id}")
    public List<EmpAdvanced> getEmpAdvancedByid(@PathVariable Integer id){
        return empAdvancedService.getEmpAdvancedByid(id);
    };

}
