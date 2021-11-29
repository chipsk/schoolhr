package com.schoolhr.sevice;

import com.schoolhr.mapper.ActManaMapper;
import com.schoolhr.model.ActManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActManaService {
    @Autowired
    ActManaMapper actManaMapper;
    public List<ActManagement> getAllActions() {
        return actManaMapper.getAllActions();
    }

    public List<ActManagement> GetActionByid(Integer id) {
        return actManaMapper.GetActionsByid(id);
    }
}
