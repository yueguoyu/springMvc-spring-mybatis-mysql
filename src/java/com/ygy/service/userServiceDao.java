package com.ygy.service;

import com.ygy.model.Test;

public interface userServiceDao {
   public Test select(int test);
   public void insert(Test test);
   public Test selectBean(Test test);
}
