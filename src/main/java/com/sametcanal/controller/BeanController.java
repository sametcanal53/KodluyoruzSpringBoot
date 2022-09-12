package com.sametcanal.controller;

import com.sametcanal.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {
    @Autowired
    public BeanConfig beanConfig;

    // http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto")
    @ResponseBody // html olmadan ekrana bastır
    public String getBeanDto(){
        return beanConfig.beanDto()+".";
    }

}
