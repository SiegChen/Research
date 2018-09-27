package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.service.testService;
import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class testController {

    @Autowired
    private testService testService;

    @RequestMapping("/findName")
  //  @ResponseBody
    public String findName(){
        return "ttt";
    }

}
