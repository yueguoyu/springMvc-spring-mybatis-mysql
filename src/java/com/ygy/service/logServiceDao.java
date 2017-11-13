package com.ygy.service;

import com.ygy.model.Log;

import java.util.List;

public interface logServiceDao {
    public void insert(Log log);
    public List<Log> select(Log log);
    public void delete(Log log);
}
