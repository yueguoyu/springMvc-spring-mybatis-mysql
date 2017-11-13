package com.ygy.service;

import com.ygy.mapper.LogMapper;
import com.ygy.model.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class logServiceDaoImpl implements logServiceDao {
    @Autowired
    private LogMapper logMapper;
    @Override
    public void insert(Log log) {
       this.logMapper.insertLog(log);
    }

    @Override
    public List<Log> select(Log log) {
        return this.logMapper.selectBean(log);
    }

    @Override
    public void delete(Log log) {
        this.logMapper.delet(log);
    }
}
