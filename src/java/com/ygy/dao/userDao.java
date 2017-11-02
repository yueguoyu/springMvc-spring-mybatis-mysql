package com.ygy.dao;

import com.ygy.mapper.TestMapper;
import com.ygy.model.Test;

public interface userDao {
    public void insert(Test test);
    public Test select(int id);
    public void update(Test test);
    public void  delete(int id);
}
