package com.ygy;

import com.ygy.service.userServiceDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {
    @Test
    public void mi(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-mybatis.xml");
           userServiceDao dao= (userServiceDao) context.getBean("userService");
//           com.ygy.model.Test test=new com.ygy.model.Test();
//           test.setId(2);
//           test.setName("ygy");
        System.out.println(dao.select(1).getName());
    }
}
