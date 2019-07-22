package com.ssm.controller;

import com.ssm.pojo.T_user;
import com.ssm.service.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    TestService service;

    @RequestMapping(value = "/ontroller",method = RequestMethod.POST)
    @ResponseBody
    public List<T_user> Test(){
       return service.test();
    }

    @RequestMapping(value = "/ontroller1",method = RequestMethod.POST)
    @ResponseBody
    public List<T_user> Test1(){
       return service.test();
    }
    @RequestMapping(value = "/ontroller2",method = RequestMethod.POST)
    @ResponseBody
    public List<T_user> Test2(){
       return service.test();
    }
}
