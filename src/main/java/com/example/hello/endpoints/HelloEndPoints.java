package com.example.hello.endpoints;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qoutes.obj.Qoutes;
import qoutes.obj.services.QoutesServices;

@RestController
public  class HelloEndPoints{
    private QoutesServices qoutesServices;

    public HelloEndPoints(QoutesServices qoutesServices){
        this.qoutesServices = qoutesServices;
    }

    // not important 
//    @RequestMapping("/hello")
//    public String hello(){
//        return "hello vivo";
//    }
    @RequestMapping("/qoutes")
    public Qoutes getQoutes(){
        return this.qoutesServices.getQoutes();
    }
    @RequestMapping(value = "/qoutes", method = RequestMethod.POST)
    public void addQoute(@RequestBody Qoutes qoutes){
        this.qoutesServices.addQoute(qoutes);
    }
}