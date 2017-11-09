package com.ygy.service;

import com.ygy.mapper.TestMapper;
import com.ygy.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userServiceDaoImpl implements userServiceDao {
    @Resource
    private TestMapper mapper;

    @Override
    public Test select(int id) {

        return this.mapper.selectBean(id);
    }


}
