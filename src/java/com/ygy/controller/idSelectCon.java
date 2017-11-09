package com.ygy.controller;

import com.ygy.model.Test;
import com.ygy.service.userServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class idSelectCon {
    @Autowired
    userServiceDao dao;
    @RequestMapping(value = "/from",method =GET)
    public ModelAndView sayhello() {
        ModelAndView mv = new ModelAndView("index", "user", new Test());
        return mv;
    }
    @RequestMapping("/s")
    public String select(Test test){
       Test test1= this.dao.select(test.getId());

        System.out.println(test1.getName());
        return "success";
    }
 }
