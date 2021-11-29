package com.schoolhr.sevice;

import com.schoolhr.mapper.JobLevelMapper;
import com.schoolhr.model.JobLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class JobLevelService {
    @Autowired
    JobLevelMapper jobLevelMapper;

    public List<JobLevel> getAllJobLevels() {
        return jobLevelMapper.getAllJobLevels();
    }

    public Integer addJobLevel(JobLevel jobLevel) {
        jobLevel.setCreateDate(new Date());
        jobLevel.setEnabled(true);
        return jobLevelMapper.insert(jobLevel);
    }

    public Integer updateJobLevel(Integer id) {
        return jobLevelMapper.updateByPrimaryKey(id);
    }

    public Integer deleteJobLevelById(Integer id) {
        return jobLevelMapper.deleteByPrimaryKey(id);
    }

    public Integer deleteJobLevelsByIds(Integer[] ids) {
        return jobLevelMapper.deleteJobLevelsByIds(ids);
    }

    public Integer updateJobLevelById(Integer id) {
        return jobLevelMapper.updateByPrimaryKey(id);
    }
}
