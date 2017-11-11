package com.ygy.controller;

import com.ygy.model.Test;
import com.ygy.service.userServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class idSelectCon {
    @Autowired
    userServiceDao dao;
   @RequestMapping(value = "/index")
    public ModelAndView index(Test test){
       ModelAndView mv=new ModelAndView("index","test",new Test());
       return mv;
   }
    @RequestMapping("/")
    public String home(){
        return "test";
    }
    @RequestMapping("/login")
    public String login(Test test,Model model){
        System.out.println(test.getId());
        Test test1=dao.select(test.getId());
        model.addAttribute("u",test1);
        return "success";
    }
 }
