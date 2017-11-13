package com.ygy;

import com.ygy.service.userServiceDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class test {
    private static Logger logger=Logger.getLogger(String.valueOf(test.class));
    @Autowired
   private userServiceDao userServiceDao;
    @Test
    public void mi() {

    }
}

