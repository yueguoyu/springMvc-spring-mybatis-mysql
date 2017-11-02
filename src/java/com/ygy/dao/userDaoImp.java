package com.ygy.dao;

import com.ygy.mapper.TestMapper;
import com.ygy.model.Test;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class userDaoImp extends SqlSessionDaoSupport implements userDao {
    @Override
    public void insert(Test test) {
        this.getSqlSession().insert("insert",test);
    }

    @Override
    public Test select(int id) {

        return this.getSqlSession().selectOne("selectBean",id);
    }

    @Override
    public void update(Test test) {
        this.getSqlSession().update("updateByPrimaryKeySelective",test);
    }

    @Override
    public void  delete(int id) {
         this.getSqlSession().delete("deleteByPrimaryKey",id);
    }
}
