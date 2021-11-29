package com.schoolhr.schrweb.controller;

import com.schoolhr.model.ActManagement;
import com.schoolhr.model.Personnel.EmpInfo;
import com.schoolhr.sevice.ActManaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/log")
public class ActManaController {
    @Autowired
    ActManaService actManaService;
    @GetMapping("/")  //ok
    public List<ActManagement> GetAllActions(){
        return actManaService.getAllActions();
    }
    @GetMapping("/{id}")
    public List<ActManagement> GetActionsByid(@PathVariable Integer id){
        return actManaService.GetActionByid(id);
    }

}
