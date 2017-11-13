package com.ygy.controller;

import com.ygy.model.Log;
import com.ygy.service.logServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class logCon {
    @Autowired
    logServiceDao logServiceDao;

@RequestMapping("/log/insert")
public String insert(Log log){
  this.logServiceDao.insert(log);
  return "test";
}
@RequestMapping("/log/select")
    public  String logSelect(Log log){
    ModelAndView mv=new ModelAndView();
   List<Log> log1= this.logServiceDao.select(log);
//   遍历打印
    for (Log log2:log1) {
        System.out.println(log2.getLog());
    }
    //mv.addObject("log1",log1);
   return "haha";
}
}
