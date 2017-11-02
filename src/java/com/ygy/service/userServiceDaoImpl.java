package com.ygy.service;

import com.ygy.dao.userDao;
import com.ygy.model.Test;

public class userServiceDaoImpl implements userServiceDao {
    private userDao userDao;

    public void setUserDao(com.ygy.dao.userDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void insert(Test test) {
        userDao.insert(test);
    }

    @Override
    public Test select(int id) {
        return (Test) userDao.select(id);
    }

    @Override
    public void update(Test test) {
        userDao.update(test);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
