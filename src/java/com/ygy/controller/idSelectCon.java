package com.ygy.controller;

import com.ygy.model.Log;
import com.ygy.model.Test;
import com.ygy.service.userServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class idSelectCon {
    @Autowired
    userServiceDao dao;

    @RequestMapping(value = "/index")
    public ModelAndView index(Test test) {
        ModelAndView mv = new ModelAndView("index", "test", new Test());
        return mv;
    }
//主页
    @RequestMapping("/")
    public String home(Test test,Log log) {
        return "test";
    }
//登录
    @RequestMapping("/login")
    public String login(Test test, Log log) {

          Test test1=  dao.selectBean(test);
        System.out.println(test1.getPassword());
          if (test1.getPassword().equals(test.getPassword())){
        return "logInsert";
          }
          else{
            return "test";
        }
    }

    //    注册
    @RequestMapping("/insertUser")
    public String insertUser(Test test) {
//        添加
        ModelAndView mv = new ModelAndView("insertUser", "test", new Test());
        dao.insert(test);
        return "logInsert";
    }
}
