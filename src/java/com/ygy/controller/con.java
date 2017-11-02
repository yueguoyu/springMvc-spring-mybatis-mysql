package com.ygy.controller;

import com.ygy.model.Test;
import com.ygy.mvcservice.mvcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class con {
    @Autowired
    mvcService mvcService;
    @RequestMapping(value = "/",method = RequestMethod.GET)    //首页
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("index","user", new Test());
        return mv;
    }
    @RequestMapping("/login")
    public String index(Test test){
        System.out.println(test.getName());
      //  mvcService mService=new mvcService();
        mvcService.select(test);
        return "success";
    }

}
