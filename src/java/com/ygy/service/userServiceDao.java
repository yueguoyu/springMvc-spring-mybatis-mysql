package com.ygy.service;

import com.ygy.model.Test;

public interface userServiceDao {
   public void insert(Test test);
   public Test select(int test);
   public  void update(Test test);
   public  void delete(int id);
}
