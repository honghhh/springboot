package com.springboot.day18.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(){return "Hello User!";}
}
