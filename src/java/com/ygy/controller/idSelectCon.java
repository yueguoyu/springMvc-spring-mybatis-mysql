package com.ygy.controller;

import com.ygy.model.Test;
import com.ygy.service.userServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
@Controller
public class idSelectCon {
    @Autowired
    userServiceDao dao;
   @RequestMapping(value = {"/",""})
    public String index(){
       return "login";
   }
   @RequestMapping("/select")
    public String idSelect(@RequestParam Test test, HttpServletRequest rq){
        rq.getSession().setAttribute("t1",test);
        return "redirect:/index";
   }
   @RequestMapping("/out")
    public String out(HttpServletRequest request){
    request.getSession().removeAttribute("t1");
    return "redirect:/login";
   }
 }
