package com.ygy.mvcservice;

import com.ygy.model.Test;
import com.ygy.service.userServiceDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class mvcService {
    ApplicationContext context=new ClassPathXmlApplicationContext("spring-mybatis.xml");
    userServiceDao dao= (userServiceDao) context.getBean("userService");

           public int select(Test test){
               int state=0;
              String name= dao.select(1).getName();
              if (name.equals(test.getName()))
                   state=1;
              return state;
           }
}
